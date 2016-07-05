package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("ют╥б>");
		
		int num = stdin.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println(sum);

	}

}
