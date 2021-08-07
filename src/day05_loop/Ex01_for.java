package day05_loop;

public class Ex01_for {
	public static void main(String[] args) {
		/*
		 for문은 ; 개수가 무조건 2개가 들어와야 한다
		 초기값 조건식 증감식은 없어도 상관없다
		 for(초기값; 조건식 ; 증감식){
		 	종속문장
		 	}
		 	규칙적으로 값이 변한다면 for를 쓸 수 있다
		 */
		
		
		int sum = 0,cnt =1;
		sum +=cnt++; //1 이렇게 숫자아닌 ++로 나타내도 가능
		sum +=cnt++; //2  결국 이렇게 규칙적으로 값이 변하는것에 for를 씀
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
