package calc;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		int a, b, c =0;
		char operator ;
		
		System.out.println("Please Enter a Expression");
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		operator = s.next().charAt(0);
		b = s.nextInt();
				
		
		switch(operator){
		case '+': 
			c = add(a,b);
			break;
		case '-':
			c = sub(a,b);
			break;
		case '*':
			c = multi(a,b);
			break;
		case '/':
			c = div(a,b);
			break;
		}
		
		System.out.println("result is " + c);
				
	}

	private static int div(int a, int b) {
		return a/b;
	}

	private static int multi(int a, int b) {
		return a*b;
	}

	private static int sub(int a, int b) {
		return a-b;
	}

	private static int add(int a, int b) {
		return a+b;
	}
}
