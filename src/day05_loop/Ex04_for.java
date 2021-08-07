package day05_loop;

public class Ex04_for {
	public static void main(String[] args) {
		int su=1, sum=0;
		for(;su <=10;) { //초기값이이 없을 수도..그래서 있는것만 실행
			sum +=su;
			su++;
			
		}
		System.out.println("1~10 합 : "+ sum);
		for(;;) {
			System.out.println("실행");
		}
	}

}
