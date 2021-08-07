package day05_loop;

public class quiz01 {
	public static void main(String[] args) {
		
		
		//1¹ø.
		for(int i =1; i<=4; i++ ) {
			System.out.println(i +".hello");
		}

		
		//2¹ø.
		int sum=0;
		for(int i =1; i<=100; i++) {
			sum += i;
			if(sum==528)
				System.out.println(i);
		}
			
		//3¹ø.
		for(int i=1; i<=25 ; i++) {
			/*System.out.print(i+ "  ");
			if(i%5 == 0) {
				System.out.println();
			}
			*/
			if(i%5 == 0) {
				System.out.println(i);
			}else {
				System.out.print(i+"\t");
			}
			
		}
		
		}
		
	}


