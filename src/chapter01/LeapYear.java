package chapter01;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2015;
		
		if(year % 4 != 0) {
			System.out.println("������  �ƴմϴ�.");
		} else if(year % 100 != 0){
			System.out.println("���� �Դϴ�.");
		} else if (year % 400 != 0) { 
			System.out.println (year + "���� ������ �ƴմϴ�."); 
		} else { 
				System.out.println (year + "���� �����Դϴ�."); 
		} 
	}

}
