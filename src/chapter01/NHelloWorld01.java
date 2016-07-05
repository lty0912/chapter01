package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		
		System.out.println("count 값을 입력하세요.");
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
