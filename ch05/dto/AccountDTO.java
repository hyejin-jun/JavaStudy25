package ch05.dto;

public class AccountDTO {	// 필드
	
	private String ano ;			// 계좌번호
	private String owner ;			// 예금주
	private int bal ;				// 잔액
	private String bankName ;		// 은행명
	

	
	
	
	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBal() {
		return bal;
	}


	public void setBal(int bal) {
		this.bal = bal;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public AccountDTO() {	// 자동 생성자
	}


	public AccountDTO(String ano, String owner, int bal, String bankName) {		// 사용자 생성자
		
		this.ano = ano;
		this.owner = owner;
		this.bal = bal;
		this.bankName = bankName;
	}
	
	
}
