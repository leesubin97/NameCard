package main;

import cls.NameCard;
import cls.PrintNameCard;

public class MainClass {
	//Ȯ�强 ����
	public static void main(String[] args) {
		
	
	NameCard ncard = new NameCard("ȫ�浿","123-4567","vivianlee77@");
	
	ncard.setPrintNameCard(new PrintNameCard());
	ncard.print();
	//setPrintNameCard(new PrintNameCard());
}
}