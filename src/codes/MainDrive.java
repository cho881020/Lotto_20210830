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
				
//				1. 숫자 범위 (1~45) 검사.
//				질문사항 : 1보다 크거나 같은?  AND  45보다 작거나 같은가?
				
				boolean isRangeOk =  (1 <= num) && (num <= 45) ;
				
//				2. 중복 검사.
//				6개의 숫자 저장할 배열에 => 지금 입력한 num가 이미 들어있나?
//				6칸 배열에 적힌 값을 모두 꺼내봤을때 -> num와 같은게 하나라도 있는가?
//				일단 써도 괜찮다 => 같은 숫자를 찾으면 : 쓰면 안된다고 변경.
				
				boolean isDuplOk = true;
				
//				입력 숫자 목록 조회 => 배열 내부 값 : for-each
				for ( int input   : inputNumbers ) {
					
//					지금 입력한 num과, 배열에서 꺼내온 input이 같은가?
					if (num == input) {
//						같은 값을 찾았다! => 중복된 값을 발견!
//						이 num는 더이상 중복검사 통과가 아님.
						isDuplOk = false;
						
//						하나라도 같은값 찾으면, 중복 확정. 더 반복 필요 X
						break;
					}
					
				}
				
//				검사를 둘다 통과했다면? 다음 숫자 입력받으러. => while 무한반복을 깨주자.
				if ( isRangeOk && isDuplOk ) {
					
//					범위 / 중복 모두 통과한 상황. => 이 num는 입력값으로 등록해도 됨.
					
					inputNumbers[i] = num;
					
//					제대로 된 입력 OK. => 다음 숫자 입력. 무한반복 탈출.
					break;
				}
				else {
//					검사 통과 실패 : 다시 입력해달라는 안내.
					
//					어떤 부분이 잘못되었는지도 안내.
					if (!isRangeOk) {
//						범위검사 탈락.
						System.out.println("1~45의 숫자만 입력가능합니다.");
					}
					else {
//						범위검사 OK. 중복검사 탈락해서 실패.
						System.out.println("이미 입력한 숫자입니다.");
					}
					
					System.out.println("다시 입력 해주세요.");
				}
				
			}

		}
		
		
//		입력 모두 완료. => 당첨번호 6개 생성.
		
//		6개 숫자 배열.
		int[] winNumbers = new int[6];
		
//		6개의 숫자를 대입. => 검사를 통과한 숫자가 나올때까지 대입.
		
		for (int i=0 ; i < winNumbers.length ; i++) {
			
			while (true) {
				
//				1~45의 숫자를 컴퓨터가 랜덤으로 추출.
				
//				애초에 1~45 추출 : 범위검사는 필요 없다.
				
//				당첨번호목록에 중복인지는 확인해야함.
				boolean isDuplOk = true;
				
				if (isDuplOk) {
					
//					중복검사만 통과해도, 다음 숫자 뽑으러 가자.
					break;
				}
			}
			
		}

	}

}










