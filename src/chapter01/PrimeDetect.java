package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("�Ҽ����� �Ǵ��� ����: ");

		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		stdin.close();
		

		while (divisor < num) {			
			if( (num % divisor) == 0) {
				isPrime = false; 
				break;
			}
			divisor++;
		}
			
		
		if (isPrime == true) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");

		}


	}

}
