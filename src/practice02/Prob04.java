package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] result = str.toCharArray();
		int begin = 0;
		int end = result.length - 1;
		char temp;

		while (end > begin) {
			temp = result[begin];
			result[begin] = result[end];
			result[end] = temp;
			begin++;
			end--;
		}
		return result;
	}

	public static void printCharArray(char[] array){
		for (Character c : array) {
				System.out.print(c);
		}
		System.out.println();
	}
}
