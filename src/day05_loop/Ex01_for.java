package day05_loop;

public class Ex01_for {
	public static void main(String[] args) {
		/*
		 for���� ; ������ ������ 2���� ���;� �Ѵ�
		 �ʱⰪ ���ǽ� �������� ��� �������
		 for(�ʱⰪ; ���ǽ� ; ������){
		 	���ӹ���
		 	}
		 	��Ģ������ ���� ���Ѵٸ� for�� �� �� �ִ�
		 */
		
		
		int sum = 0,cnt =1;
		sum +=cnt++; //1 �̷��� ���ھƴ� ++�� ��Ÿ���� ����
		sum +=cnt++; //2  �ᱹ �̷��� ��Ģ������ ���� ���ϴ°Ϳ� for�� ��
		sum +=cnt++; //3
		sum +=cnt++; //4
		sum +=cnt++; //5
		sum +=cnt++; //6
		sum +=cnt++; //7
		sum +=cnt++; //8
		sum +=cnt++; //9
		sum +=cnt++; //10
		
		
		System.out.println(sum);
		System.out.println(cnt);
		sum=0;
		for(cnt=1; cnt <=10; cnt++) {
			sum += cnt;  
			
		}
		System.out.println("sum : " +sum);
		System.out.println("cnt : "+cnt);
	}

}
