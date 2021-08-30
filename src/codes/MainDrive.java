package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		 입력한 6개의 숫자를 저장할 배열.
		int[] inputNumbers = new int[6];
		
//		6개의 숫자에 Scanner를 이용해서 숫자 입력. => 6회 반복.
		
//		for이전에 스캐너 한대 만들고 => for 안에서 반복 사용만.
		Scanner myScanner = new Scanner(System.in);
		
		for (int i=0 ; i < inputNumbers.length ; i++) {
			
//			안내 문구 출력
			System.out.print((i+1)+"번째 숫자 입력 : ");
			
//			입력한 숫자를 임시 변수에 저장. (검사 통과해야 배열에 대입)
			int num = myScanner.nextInt();
			
		}
		
	}

}







