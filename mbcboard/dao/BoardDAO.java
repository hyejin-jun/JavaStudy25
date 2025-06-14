package mbcboard.dao;

import java.nio.file.attribute.AclEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard.dto.BoardDTO;

public class BoardDAO {

	
	public BoardDTO boardDTO = new BoardDTO() ;
	public Connection connection = null ; // 연결
	public Statement Statement = null ;  // 성명
	public PreparedStatement preparedStatement = null ;  // 준비된 진술
	public ResultSet resultSet = null ;  // 결과
	public int result = 0 ;
	
	
	public BoardDAO() {  // 기본 생성자
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");  // 1 단계 연결
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest", "boardtest"); // 2 단계 연결	

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나 ojdbc6.jar 파일이 잘못되었습니다");
			e.printStackTrace();
		} catch (SQLException e) { // Exception: 예외
			System.out.println("URL, ID< PW가 잘못되었습니다 boardDAO에 기본 생성자를 확인하세요");
			e.printStackTrace();
			System.exit(0);  // 강제 종료
		}
	}
	
// 메서드 시작
	public void selectAll() throws SQLException {  // BoradService에서 selectAll의 객체 생성
		String sql = "select bno, btitle, bwriter, bdate from borad order by bdate desc"; // bdate 설명에 따라 borad order에서 bno, btitle, bwriter, bdate를 선택
		// 데이터베이스에서 board 테이블 내용을 가지고 오는 쿼리문
		
		try {
			Statement = connection.createStatement() ;  // 쿼리문을 실행할 객체
			resultSet = Statement.executeQuery(sql);  // 쿼리문을 실행하여 결과를 표로 받음
			// 여기에서부터 트라이 걸어야 함!!
			
			System.out.println("번호\t 제목\t 작성자\t 작성일\t");
			while(resultSet.next()) {  // 결과 표에 위에서부터 아래까지 내려오면서 출력
				System.out.println(resultSet.getInt("bno")+"\t");
				System.out.println(resultSet.getString("btitle")+"\t");
				System.out.println(resultSet.getString("bwiter")+"\t");
				System.out.println(resultSet.getDate("bdate")+"\t");
			} // 와일 종료
			System.out.println("========== 끝 ============");
			
		} catch (SQLException e) {
			System.out.println("selectAll() 메서드에 쿼리문이 잘못되었습니다");
			e.printStackTrace();
		} finally { // 항상 실행문
			resultSet.close();
			Statement.close();
		}

	}

	public void insertBoard(BoardDTO boardDTO) throws SQLException {  // BoardService의 insertBoard에서 받아옴
		
	try {
		String sql = "insert into board (bno, btitle, bcontent, bwiter, bdate)" + "values(boar_seq.nextval, ?, ?, ?, sysdate)";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, boardDTO.getBtitle());
		preparedStatement.setString(2, boardDTO.getBcontent());
		preparedStatement.setString(3, boardDTO.getBwriter());
		System.out.println("쿼리 확인: " + sql);

		result = preparedStatement.executeUpdate() ; // 쿼리문을 실행하여 결과를 정수로 받음 
		
		if (result > 0) {
			System.out.println(result + " 개의 게시물이 등록되었습니다");
			connection.commit(); // 영구 저장
	} else {
		System.out.println("쿼리 실행 결과: " + result);
		System.out.println("입력 실패 ㅡㅡ!!!");
		connection.rollback();  // 저장 취소
	}  // 엘스 종료
	} catch  (SQLException e) {
		System.out.println("예외 발생: insertBoard() 메서드에 쿼리문을 확인하세요");
		e.printStackTrace();
	} finally { // 예외 발생 및 정상 실행 후 무조건 처리되는 실행문
		preparedStatement.close();
	}
	}

	
	public void readOne(String title) throws SQLException {
		try {
			String sql = "select bno, btltle, bcontent, bwriter, bdate from board where btitle = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title);  // select에서 넘오온 찾고 싶은 제목이 ?로 넘어감
			resultSet = preparedStatement.executeQuery();  // 쿼리문 실행 후 결과를 표로 받음
			
			if (resultSet.next())  { // 검색 결과가 있으면
			BoardDTO boardDTO = new BoardDTO();  // 빈 객체 생성
			boardDTO.setBno(resultSet.getInt("bno"));
			boardDTO.setBtitle(resultSet.getString("btitle"));
			boardDTO.setBcontent(resultSet.getString("bcontent"));
			boardDTO.setBwriter(resultSet.getString("bwriter"));
			boardDTO.setDate(resultSet.getDate("bdate"));  // 데이터베이스에 있는 행을 객체에 넣기
			
			System.out.println("============================");
			System.out.println("번호: " + boardDTO.getBno());
			System.out.println("제목: " + boardDTO.getBtitle());
			System.out.println("내용: " + boardDTO.getBcontent());
			System.out.println("작성자: " + boardDTO.getBwriter());
			System.out.println("작성일: " + boardDTO.getDate());
			} else { //  검색 결과가 없으면
				System.out.println("해당 게시물이 존재하지 않습니다");
			}
		} catch (SQLException e) {
			System.out.println("예외 발생!! ");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
			resultSet.close();
		}
		
	}

		
	
}
	
