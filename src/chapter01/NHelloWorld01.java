package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		
		System.out.println("count ���� �Է��ϼ���.");
		Scanner scanner = new Scanner( System.in );

		int count= scanner.nextInt();
		int i = 0;
		
		while(count > i) {
			System.out.println("Hello World");
			i++;
		}
		
		scanner.close();

	}

}
