package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dto.BoardDTO;
import dto.MemberDTO;
import service.LoginService;

public class LoginDAO {
	
	
	
	public BoardDTO boardDTO = new BoardDTO();
	public Connection connection = null;			// 1 단계에서 사용하는 객체
	public Statement statement = null ;			// 3 단계에서 사용하는 객체 (구형), 변수 직접 처리 '" + name +"'
	public PreparedStatement preparedStatement = null ;	// 3 단계에서 사용하는 객체 (신형), ?(인파라미터)
	public ResultSet resultSet = null ;			// 4 단계에서 결과 받는 표 객체 executeQuery (select)
	public int result = 0 ;	
	
	
public LoginDAO() {
		
		try {	// 예외가 발생할 수 있는 실행문 (프로그램 강제 종료 처리용)
			Class.forName("oracle.jdbc.driver.OracleDriver");  // 1 단계 ojdbc6.jar 호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest1", "boardtest1");  // 2 단계
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 이름이나 ojdbc6.jar 파일이 잘못되었습니다");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("url, id, pw가 잘못되었습니다 BoardDAO에 기본 생성자를 확인하세요");
			e.printStackTrace();
			System.exit(0);  // 강제 종료
			
		}

 	}  // 기본 생성자 종료


public MemberDTO login(MemberDTO session) throws SQLException {// 로그인 메뉴
	
	  PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    
	try {
		String sql = "select * from member where id = ? and pw = ?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, session.getId());
		preparedStatement.setString(2, session.getPw());

		resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			session.setMno(resultSet.getInt("mno"));
          session.setId(resultSet.getString("id"));
          session.setPw(resultSet.getString("pw"));
          session.setRegidate(resultSet.getDate("regidate"));
          
          

		} else {
			session.setMno(0);
		}
		} catch (Exception e) {
			System.out.println("예외 발생 ㅋ");
			e.printStackTrace();
		} finally {
	       
			if (resultSet != null) resultSet.close();
	        if (preparedStatement != null) preparedStatement.close();
	
		}
	return session;
}

}
