
public class ForStatementExample {

	public static void main(String[] args) {
		int evenSum=0;
		int oddSum=0;
		
		int i;
		
		for(i=1;i<=100; i++) {
			if(i%2==0) evenSum+=i;
			else oddSum+=i;
		}
		System.out.println("짝수합: "+evenSum);
		System.out.println("홀수합: "+oddSum);
		
		
	}
	
	
	public static void main2(String[] args) {

		int sum =0;
		for(int i = 1; i<=10; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}
	public static void main1(String[] args) {

		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
	/*	for(;;) {   무한루프
			System.out.println("..");
		}*/  
		

	}

}
