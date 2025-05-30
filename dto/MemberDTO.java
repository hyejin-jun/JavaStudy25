package dto;

public class MemberDTO {
	// 필드
	
	public String id ; 		// 아이디
	public String pw ;		// 패스워드
	public String nick ;	// 닉네임
	public String email ;	// 이메일
	

	public MemberDTO memberDTO ;	// 멤버 객체
	public CharacterDTO characterDTO;	// 캐릭터 객체
	

	



	
	// 기본 생성자
	public MemberDTO() {
		
	}	// 기본 생성자 종료
	
	// 사용자가 만든 생성자
	public MemberDTO(String id, String pw, String nick, String email, CharacterDTO characterDTO) {
		this.id = id ;
		this.pw = pw ;
		this.nick = nick ;
		this.email = email ;
		this.characterDTO = characterDTO ;
		
	}	// 사용자가 만든 생성자 종료


	


	



	



	
	// 생성자


	
	
	
	
	
	
	
	
	// 메서드


}
