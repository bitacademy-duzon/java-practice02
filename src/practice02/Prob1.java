package practice02;

public class Prob1 extends TaskFactory {

	private final int[] coinDim = {50000, 10000, 5000, 1000, 500, 100, 50, 1};
	private final int COIN_COUNT = coinDim.length;
	private final int[] coinCount = new int[COIN_COUNT];
	private int nowCost = 0;
	
	
	public Prob1() {
		
		super();
	
		
		
	}
	
	@Override
	public void input() {
		super.input();
		System.out.println("-------- 금액을 입력하세요 --------");
		input = sc.nextInt();
	
	
	}
	
	@Override
	public void solve() {
		
		int min = coinDim[coinDim.length - 1];
		int i = 0;
		nowCost = input;
		

		while((nowCost / min) != 0) {
			
			coinCount[i] = nowCost/coinDim[i];

			if(coinCount[i] != 0) {
				
				nowCost = nowCost % coinDim[i];

			};
			
			i++;
			
		}
		
	}
	

	@Override
	public void print() {
		
		for(int i=0; i < COIN_COUNT; ++i) {
			
			System.out.println(" 현재 단위.. " + coinDim[i]);
			System.out.println(" 현재 매수.. " + coinCount[i]);
			System.out.println("\n");
			
			
		}
		
	}



	
	
	
	
	
}
