package chapter01;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("³ôÀÌ>");
		
		int height = stdin.nextInt();		
		
		//´Ã¾î³ª´Â »ï°¢Çü
		/*  
		for(int i=1; i <= height; i++) {
			
			for(int j=1; j <= i; j++) {
			System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		
		//ÁÙ¾îµå´Â »ï°¢Çü
		
		for(int i=height; i>0; i--){
			
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		stdin.close();

	}

}
