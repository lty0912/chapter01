package chapter01;

import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("����>");
		
		int height = stdin.nextInt();	
		
		for(int i=1; i <= height; i++) {
			
			for(int j=1; j <= i; j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		stdin.close();

	}

}
