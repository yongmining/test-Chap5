package com.greedy.section01.array;

public class Application5 {

	public static void main(String[] args) {
		/* 랜덤한 카드 한 장을 뽑아서 출력 */
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] cardNumbers = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};
		
		int randomShapeIndex = (int)(Math.random() * shapes.length);
		int randomcardNumbersIndex = (int)(Math.random() * cardNumbers.length);
		
		System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " "+ cardNumbers[randomcardNumbersIndex]+ "카드입니다.");
			
		
	}

}
