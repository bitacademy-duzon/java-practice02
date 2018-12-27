package practice02;

import java.util.Scanner;

public abstract class TaskFactory implements Task{
	
	protected final Scanner sc = new Scanner(System.in);
	protected int input = 0;
	protected int answer = 0;
	
	//Template Method

	public void input() {};
	public void print() {};
	
	
}

