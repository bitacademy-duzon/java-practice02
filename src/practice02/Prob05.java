package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		do {
			/**
			 * 처음 숨길 카드를 선택하기 위해서는 다음과 같이 Random 클래스를 이용하여
			 * 1~100까지의 임의의 정수를 생성합니다.
			 */
			Random r = new Random();
			int k = r.nextInt(100) + 1;
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println("1-100");

			int count = 1;			
			while (true) {			
				System.out.print((count++) + ">>");
				String targetNum = scanner.next();
				
				if (Integer.parseInt(targetNum) > k) {
					System.out.println("더 낮게");
					continue;
				} else if (Integer.parseInt(targetNum) < k) {
					System.out.println("더 높게");
					continue;
				}
				
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				
				/**
				 * "다시 하시겠습니까(y/n)>>"에 대한 대답으로 사용자가 "y"나 "n"을 입력받고
				 * 비교하기 위해 다음의 코드를 사용합니다.
				 */
				String answer = scanner.next();
				if( answer.equals("y") ){
					break;
				} else {
					//종료하도록 작성한다.
					flag = false;
					return;
				}
			}
		} while (flag);
	}	// end of main
	
}
