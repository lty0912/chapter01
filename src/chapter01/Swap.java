package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;

		// Q1: n1���� �׻� ū ���� �ǵ���, �ʿ��� ��� n1�� n2�� ��ü�϶�.
		
		if(n2 >= n1) {
			int temp;
			temp = n2;
			n2 = n1;
			n1 = temp;			
		}
		System.out.println("n1: " + n1);
		

		// Q2: �ִ밪�� �Ǻ��ϴ� ������ �ϼ��� ������.
		int a1 = 10;
		int a2 = 20;
		int a3 = 30;

		if ( (a1 >= a2) && (a1 >= a3) ) {
			System.out.println("�ִ밪�� a1:" + a1);
		} else if ( (a2 >= a1) && (a2 >= a3) ){
			System.out.println("�ִ밪�� a2:" + a2);
		} else if ( (a3 >= a1) && (a3 >= a2) ) {
			System.out.println("�ִ밪�� a3:" + a3);
		}

	}

}
