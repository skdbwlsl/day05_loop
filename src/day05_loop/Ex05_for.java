package day05_loop;

public class Ex05_for {
	public static void main(String[] args) {
		int su1=0, su2=0, sum=0; //이렇게 최대한 0으로 초기화해야 에러를 줄일 수 있는 방법
		for(su1=1;su1<=10;su1++) {
			System.out.println("+++시작");
			for(su2=1;su2<=10;su2++) {
				System.out.println(su2 + ".실행");
				sum+=1; //sum=sum+1
			}
			System.out.println("끝---");
		}
		System.out.println(sum);
	}

}
