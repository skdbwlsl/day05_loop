package day05_loop;

public class quiz03 {
	public static void main(String[] args) {
		int i=0; 
		for(i=2; i<=20;i+=2) {
			System.out.print(i);
		}
		
		int sum=0;
		System.out.println("2���� 20������ ���� ���մϴ�");
		for(i=2;i<=20;i++) {
			sum +=i;
		}
		System.out.println("2���� 20������ ���� " + sum+"�Դϴ�.");	
	
		
		

		for(i=1;i<=30;i++) {
			if(i%3==0) {
				sum +=i;
		
		}
		}	
			System.out.println(sum);
	
	
		
		for(i=1;i<=5;i++) {
			System.out.println(i+".2�� ¯");
			
		}
	
}	
}

