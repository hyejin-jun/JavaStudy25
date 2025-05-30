package maplestory;

public class CharacterDTO {	// 부모 객체
	
	public static final String[] SKIN_OPTIONS = {"미백", "외계인", "아란", "뽀송꽃잎", "홍조꽃잎", "모험가"};
    public static final String[] EYES_OPTIONS = {"조용한 눈", "아잉눈", "오즈 얼굴", "졸린 얼굴", "꼬맹이 얼굴"};
    public static final String[] HEAD_OPTIONS = {"솜솜이 헤어", "리커버 헤어", "여울 헤어", "베로니카 헤어", "나비야 헤어", "루나 헤어", "조용한 헤어", "채화 헤어", "멜로디 헤어"};
    public static final String[] CLOTHES_OPTIONS = {"티타니아", "마스터 포니", "초롱나비", "죽음의 데스", "마스터 타임", "플로라", "스노우", "블러드", "스텔라"};
    public static final String[] WEAPON_OPTIONS = {"목손검", "우산", "표창", "활", "지팡이", "책"};
    
    public String skin;
    public String eyes;
    public String head;
    public String clothes;
    public String weapon;
    public String[] nick;	 
    public int level ;
	
	
    public void Option () {
		 this.skin = getRandomOption(SKIN_OPTIONS);
	     this.eyes = getRandomOption(EYES_OPTIONS);
	     this.head = getRandomOption(HEAD_OPTIONS);
	     this.clothes = getRandomOption(CLOTHES_OPTIONS);
	     this.weapon = getRandomOption(WEAPON_OPTIONS);
	     this.nick = nick;
	     this.level = 1;

		
	     System.out.println("캐릭터를 생성합니다");
	     System.out.println("피부: " + skin);
	     System.out.println("눈: " + eyes);
	     System.out.println("머리: " + head);
	     System.out.println("옷: " + clothes);
	     System.out.println("무기: " + weapon);
	     System.out.println("닉네임을 입력하세요 >>> ");
	   
		
		
	}

    private String getRandomOption(String[] options) {
    int chee = (int)(Math.random() * options.length);
    return options[chee];
}

  

}
