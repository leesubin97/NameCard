package main;

import cls.NameCard;
import cls.PrintNameCard;

public class MainClass {
	//확장성 예제
	public static void main(String[] args) {
		
	
	NameCard ncard = new NameCard("홍길동","123-4567","vivianlee77@");
	
	ncard.setPrintNameCard(new PrintNameCard());
	ncard.print();
	//setPrintNameCard(new PrintNameCard());
}
}