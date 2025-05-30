package maplestory;

public class MemberDTO {
	
	private String id ;
	private String pw ;
	
	public MemberDTO() { // 기본 생성자
			}

	public MemberDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}


	

	
	

}