package dto;

public class CharacterDTO {
	// 필드
	 
	public String no ;			// 캐릭터 넘버
	public String name ;		// 캐릭터 이름
	public double anrp ;		// 캐릭터 무게
	public double threh ;		// 캐릭터 속도
	public double rkthr ;		// 캐릭터 가속
	public double gosemffld ;	// 캐릭터 핸들링
	private CharacterDTO[] characterDTOs;
	
	

	public CharacterDTO(String no, String name, double anrp, double d, double e, double gosemffld, double akckffur) {
		// CharacterDTO = new CharacterDTO () ; 의 말과 같은 말이다
		
		this.no = no ;
		this.name = name ;
		this.anrp = anrp ;
		this.threh = d ; 
		this.rkthr = e ;
		this.gosemffld = gosemffld ;
		
	
		
	

	

		
		
		
		
	}
	
	

}
