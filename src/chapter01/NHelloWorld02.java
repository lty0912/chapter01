package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		
		System.out.print("count 값을 입력하세요.");
		Scanner scanner = new Scanner( System.in );

		int count= scanner.nextInt();
		
		
		for(int i=0; i < count; i++) {
			System.out.println("Hello World");			
		}
		
		scanner.close();

	}

}
