package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		 입력한 6개의 숫자를 저장할 배열.
		int[] inputNumbers = new int[6];

//		6개의 숫자에 Scanner를 이용해서 숫자 입력. => 6회 반복.

//		for이전에 스캐너 한대 만들고 => for 안에서 반복 사용만.
		Scanner myScanner = new Scanner(System.in);

		for (int i = 0; i < inputNumbers.length; i++) {

//			각 자리의 숫자 입력은, 제대로 입력할때까지 반복.
//			몇번 하면 제대로? 알 수 없음. => 반복 횟수 불명확.

			while (true) {
				// 안내 문구 출력
				System.out.print((i + 1) + "번째 숫자 입력 : ");

//			입력한 숫자를 임시 변수에 저장. (검사 통과해야 배열에 대입)
				int num = myScanner.nextInt();
				
//				입력한 num에 대한 검사 수행.
				
//				검사를 통과했다면? 다음 숫자 입력받으러. => while 무한반복을 깨주자.
				if (false) {
					break;
				}
				else {
//					검사 통과 실패 : 다시 입력해달라는 안내.
					System.out.println("잘못된 숫자입니다. 다시 입력 해주세요.");
				}
				
			}

		}

	}

}
