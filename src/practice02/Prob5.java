package practice02;

import java.util.Random;

public class Prob5 extends TaskFactory {

	
	private int answer_num = 0; 
	private String answer = null;
	private int max = 100;
	private int min = 0;
	private int counter = 1;
	
	
	public void getRandomNum() {
		
		answer_num = new Random().nextInt(100) + 1;

		
	}
	

	
	public void inputNum() {
		System.out.println("---------- 숫자를 입력하세요 ----------");
		super.input = sc.nextInt();
	}


	@Override
	public void solve() {
		getRandomNum();
		while(true) {

			inputNum();

			if(super.input == answer_num) {
				
				print("correct");
	
				
			}else if(super.input < answer_num) {
				print("bigger");
				max = super.input;

				
			}else if(super.input > answer_num) {
				print("smaller");
				min = super.input;

			}else {
				
				new IllegalMonitorStateException("부적합한 연산 수행");
				
			}
					
			
			counter++;
	
		}
		
	}

	public void print(String token) {
		
		switch(token) {
		
		case "correct" :{
			
			System.out.println("맞았습니다!!");
			System.out.println("다시할래요? 좋으면 y 혹운 Y 입력");
			answer = sc.next();
			if(answer.equals("y")) {
							
				getRandomNum();
				
			}else {
				
				System.exit(0);
				
			}
		}break;
		
		case "bigger" : {
			
			System.out.printf("더 크게... \n %d >> %d - %d\n" ,counter,super.input, max);
			
		}break;
		
		case "smaller" : {
			
			
			System.out.printf("더 작게... \n %d >> %d - %d\n",counter, min, super.input);

			
		}break;
		
		
		
		}
		
		
		
		
	}

	
	
	
	
}
