package dto;

import java.util.Scanner;

public class CartDTO {
	// 필드
	
	public String carColor ;
	public String cartName;
	
	public String[] colors = {"빨강", "노랑", "파랑", "핑크", "검정", "초록", "주황", "보라"} ;
	public String[] carts = {"제노", "솔리드", "아이스코튼", "아틀라스", "몬스터", "브루터스", "페이라", "쉐퍼", "백기사", "나이트이글", "파라곤"} ;
	
	public CartDTO() {}

	public CartDTO(String carColor, String cartName) {
		super();
		this.carColor = carColor;
		this.cartName = cartName;
	}
	
	public CartDTO(int color, int cart) {
		this.carColor = colors[color];
		this.cartName = carts[cart]; 
	}
	
	
	
	

}
