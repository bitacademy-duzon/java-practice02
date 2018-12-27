package practice02;

import java.util.ArrayList;
import java.util.List;


public class Controller {
	
	
	public static void main(String[] args) {
		
		
		List<TaskFactory> tasks = new ArrayList<>();
		for(int i=1; i<6; ++i) {
			TaskFactory task = null;
			try {
				
			task = (TaskFactory) Class.forName("practice02.Prob"+i).newInstance();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			tasks.add(task);
			
		}
		
	
		for(int i=0; i<tasks.size(); ++i) {
			
			try {
				System.out.println("----------- 문제 출제 중입니다... -----------");
				Thread.sleep(3000);

			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("------------------ "+ (i+1) +"번 문제입니다.. ----------------");
			TaskFactory task = tasks.get(i);
			task.input();
			task.solve();
			task.print();
			System.out.println("------------------"+ (i+1) +"번 문제 종료 ----------------");

		}
		
	}

}






