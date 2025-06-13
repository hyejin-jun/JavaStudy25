package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;

import dto.MemberDTO;
import service.LoginService;

public class MemberDAO {

		// 필드
		public MemberDTO memberDTO = new MemberDTO() ;
		public Connection connection = null ;
		public Statement statement = null ;
		public PreparedStatement preparedStatement = null ;
		public ResultSet resultSet = null ;
		public int result = 0 ;
		
	public MemberDAO() {
		
		try { // 예외 발생용
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest1", "boardtest1");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나 자바 파일이 잘못 되었습니다");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("URL, ID, PW가 잘못 되었습니다");
			e.printStackTrace();
			System.exit(0);  // 강제 종료
		}
	}



public void selectAll() throws SQLException {  // 멤버 모두 보기
	
	try {
		String sql = "select mno, bwriter, id, pw, regidate from member order by regidate desc" ;
		
		statement = connection.createStatement() ; 
		resultSet = statement.executeQuery(sql); 
		
		System.out.println("번호\t 이름\t 아이디\t 비밀번호\t 날짜\t");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("mno")+ "\t");
			System.out.print(resultSet.getString("bwriter") + "\t");
			System.out.print(resultSet.getString("id")+ "\t");
			System.out.print(resultSet.getString("pw")+"\t");
			System.out.println(resultSet.getDate("regidate")+"\t");
	} // 와일 종료
	System.out.println("=========== 끝 ================");
	// 트라이 종료
	} catch (Exception e) {
		System.out.println("쿼리문이 잘못되었습니다");
		e.printStackTrace();
	} finally {
		statement.close();
		resultSet.close();
	} // 파이널리 종료

}



public void insertMember(MemberDTO memberDTO) throws SQLException {
	
	try { 
		String sql = "insert into member (mno, bwriter, id, pw, regidate)" + " values (board_seq.nextval, ?, ?, ?, sysdate)";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, memberDTO.getBwriter());
		preparedStatement.setString(2, memberDTO.getId());
		preparedStatement.setString(3, memberDTO.getPw());
		System.out.println("쿼리 확인: " + sql);
		
		result = preparedStatement.executeUpdate();
		
		if (result > 0) {
			System.out.println(result + " 개의 회원이 등록되었습니다");
			connection.commit(); // 영구 저장
		} else {
			System.out.println("쿼리 실패 ㅋ: " + result);
			System.out.println("실패입니다");
			connection.rollback(); // 저장 안 함
		} 

	} catch (SQLException e) {
		System.out.println("예외 발생 ㅋ");
		e.printStackTrace();
	} finally {
		preparedStatement.close();
	}

	
	
	
}



public void readOne(String memname) throws SQLException {
	

	try {
		String sql = "select mno, bwriter, id, pw, regidate from member where bwriter = ?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, memname); // 서비스에서 찾고 싶은 이름이 ?로 넘어간다
		resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setMno(resultSet.getInt("mno"));
			memberDTO.setBwriter(resultSet.getString("bwriter"));
			memberDTO.setId(resultSet.getString("id"));
			memberDTO.setPw(resultSet.getString("pw"));
			memberDTO.setRegidate(resultSet.getDate("regidate"));  // 데이터베이스에 있던 행을 객체에 넣기
			
			System.out.println("==============================");
			System.out.println("번호: " + memberDTO.getMno());
			System.out.println("이름: " + memberDTO.getBwriter());
			System.out.println("아이디: " + memberDTO.getId());
			System.out.println("비밀번호: " + memberDTO.getPw());
			System.out.println("가입일: " + memberDTO.getRegidate());
		} else {
			System.out.println("해당 게시물이 존재하지 않습니다");
		}
	} catch (SQLException e) {
		System.out.println("예외 발생!!!");
		e.printStackTrace();
	} finally {
		resultSet.close();
		preparedStatement.close();
	}
	

	
}




public void updateMember(String upMem, Scanner inputStr) throws SQLException {

	MemberDTO memberDTO = new MemberDTO() ;  // 빈 객체 생성
	
	System.out.print("수정할 이름을 입력하세요 >>> ");
	memberDTO.setBwriter(inputStr.next());
	System.out.print("수정할 아이디를 입력하세요 >>> ");
	memberDTO.setId(inputStr.next());
	System.out.print("수정할 비밀번호를 입력하세요 >>> ");
	memberDTO.setPw(inputStr.next());
	 
	try {
		String sql = "update member set bwriter = ?, id = ?, pw = ?, regidate = sysdate where bwriter = ?";
		
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, memberDTO.getBwriter());
				preparedStatement.setString(2, memberDTO.getId());
				preparedStatement.setString(3, memberDTO.getPw());
				preparedStatement.setString(4, upMem);

			result = preparedStatement.executeUpdate();
			
			if (result > 0 ) {
				System.out.println(result + " 명의 회원이 변경되었습니다");
				connection.commit(); // 저장
			} else {
				System.out.println("수정되지 않았습니다");
				connection.rollback(); // 저장 안 함
			}
			} catch (SQLException e) {
				System.out.println("예외 발생 ㅋ");
				e.printStackTrace();
			
	} finally {
		preparedStatement.close();
		
}


}



public boolean isId(String id) throws SQLException {
    try {
        // SQL 문: member 테이블에서 id가 같은 게 있는지 개수를 세어라
        String sql = "SELECT COUNT(*) FROM member WHERE id = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);  // 첫 번째 ? 자리에 id 넣음

        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int count = resultSet.getInt(1);  // COUNT(*) 결과를 가져옴
            return count > 0;  // 0보다 크면 이미 존재하는 아이디 (중복)
        }

    } catch (SQLException e) {
        System.out.println("예외 발생: isId()");
        e.printStackTrace();
    } finally {
        if (resultSet != null) resultSet.close();
        if (preparedStatement != null) preparedStatement.close();
    }

    return false;  // 기본적으로 중복 아님
}


}






