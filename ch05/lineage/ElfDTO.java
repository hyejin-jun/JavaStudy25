package ch05.lineage;

public class ElfDTO extends HumanDTO{

	
	public static int reduceHp;
	private String bow ;
	private String dress; 
	private String arrow ;
	
	public String getBow() {
		return bow;
	}
	public String getDress() {
		return dress;
	}
	public String getArrow() {
		return arrow;
	}
	public void setBow(String bow) {
		this.bow = bow;
	}
	public void setDress(String dress) {
		this.dress = dress;
	}
	public void setArrow(String arrow) {
		this.arrow = arrow;
	}
	
	private int hp;

	public ElfDTO() {
		this.hp = hp;
	}

	public int getHp() {
		int hp = 5000 ;
		return hp;
	}

	public void reduceHp(int damage) {
		hp -= damage;
		if (hp < 0) {
			hp = 0;
		}
	}
}

	
	

