package test;

import java.util.Scanner;

public class MemberDTO {
	
	private String name ; // 이름
	private String sex ; // 성별
	private String gkrqjs ; // 학년
	private String qks ; // 반
	
	public MemberDTO() {
		super();
		this.name = name;
		this.sex = sex;
		this.gkrqjs = gkrqjs;
		this.qks = qks;
	}


	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getGkrqjs() {
		return gkrqjs;
	}

	public String getQks() {
		return qks;
	}

	public void setName(String string) {
		this.name = string;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setGkrqjs(String gkrqjs) {
		this.gkrqjs = gkrqjs;
	}

	public void setQks(String qks) {
		this.qks = qks;
	}


	public void setGkrqjs(int nextInt) {
		// TODO Auto-generated method stub
		
	}


	public void setQks(int nextInt) {
		// TODO Auto-generated method stub
		
	}








}
