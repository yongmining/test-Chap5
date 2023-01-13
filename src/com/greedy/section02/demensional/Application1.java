package com.greedy.section02.demensional;

public class Application1 {

	public static void main(String[] args) {
		/* 다차원 배열
		 * 다차원 배열은 2차원 이상의 배열을 의미한다.
		 * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
		 * 즉, 2차원 배열은 1차원 배열 여러 개를 묶어서 관리하는 것을 의미한다.
		 * */
		
		/* 2차원 배열을 사용하는 방법
		 * 1. 배열의 주소를 보관할 레이런스 변수 선언(stack)
		 * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap) 
		 * 3. 각 인덱스에 관리하는 배열을 할당(heap)하여 주소를 저장
		 * 4. 생성한 여러 개의 1차원 배열에 차례대로 접근해서 사용
		 * */
		
		int[][] iarr1;
		int iarr2[][];
		int[] iarr3;
		
		iarr1 = new int[3][];
		
		iarr1[0] = new int[5];
		iarr1[1] = new int[5];
		iarr1[2] = new int[5];
		for(int i = 0; i < iarr1[0].length; i++) {
			System.out.print(iarr1[0][i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i < iarr1[1].length; i++) {
			System.out.print(iarr1[1][i] + " ");

		}
		System.out.println();
		
		for(int i = 0; i < iarr1[2].length; i++) {
			System.out.print(iarr1[2][i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i <iarr1.length; i++) {
			for(int j = 0; j < iarr1[i].length; j++) {
				System.out.print(iarr1[i][j] + " ");
		}
		System.out.println();
		}
	
	
	}
}