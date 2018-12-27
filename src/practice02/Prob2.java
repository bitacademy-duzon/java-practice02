package practice02;

public class Prob2 extends TaskFactory {

	  int intArray[] = new int[5];
      double sum = 0;

	
	
	
	public void input() {
		super.input();
		
		for(int i=0; i<intArray.length; ++i) {
		
			System.out.printf("%d번째 숫자를 입력하세요.. %d/%d \n", i+1, i+1, 5);
			intArray[i] = sc.nextInt();
			sum += intArray[i];
					
		}
	
	}
	
	@Override
	public void solve() {
		
		sum /= intArray.length;
	}
	

	@Override
	public void print() {
		super.print();
		
		for(int i=0; i<intArray.length; ++i) {
			
			System.out.println(intArray[i]);
			
			
		}
		
		
		System.out.printf("평균... %.2f",sum);
	
	
	}

	

	
	
	
}
