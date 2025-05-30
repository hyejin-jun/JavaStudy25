package ch05.lineage;

import java.util.Scanner;

public class Account {
	
	private String id ;
	private String pw ;
	private String nick ;
	private ElfDTO elfDTO ;	// 요정 객체
	private KinghtDTO kinghtDTO ;	// 기사 객체
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNick() {
		return nick;
	}
	public ElfDTO getElfDTO() {
		return elfDTO;
	}
	public KinghtDTO getKinghtDTO() {
		return kinghtDTO;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setElfDTO(ElfDTO elfDTO) {
		this.elfDTO = elfDTO;
	}
	public void setKinghtDTO(KinghtDTO kinghtDTO) {
		this.kinghtDTO = kinghtDTO;
	}

	
	
}
