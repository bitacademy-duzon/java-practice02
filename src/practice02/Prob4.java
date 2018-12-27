package practice02;

public class Prob4 extends TaskFactory {

	
	private String input = null;
	
	@Override
	public void input() {
		super.input();
		System.out.println("---- 뒤집을 문자열을 입력하세요 -----");
		this.input = sc.nextLine();
	}


	@Override
	public void solve() {
		
		printCharArray(reverse(this.input));
		
	}
	
	
	public char[] reverse(String  str) {
		
		char[] strArr = str.toCharArray();
		char[] charArray = new char[str.length()];
		
		for(int i=strArr.length-1; i>-1; --i) {
			
			System.out.print(strArr[i] + "\t");
			
			
		}
		
		return charArray;
	}
	
	public void printCharArray(char[] array) {
		
		
		System.out.println(array);
		
	}
	

	
	
	
}
