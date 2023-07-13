import java.util.Scanner;

public class Exercise7_1 {

	public static void main(String[] args) {

		//boolean run = true;
		int balance =0;
		
		Scanner scanner = new Scanner(System.in);
		
		//for(;;)
		while(true) {
			System.out.println("--------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("--------------");
			System.out.print("선택:");
		
		
		int menu = scanner.nextInt();
		
		switch(menu) {
		case 1: System.out.println("예금액: ");
		        int m = scanner.nextInt();
		        balance += m;
		        break;
		case 2: System.out.println("출금액: ");
		    	m = scanner.nextInt();
		    	balance -= m;
		    	break;
		
		    	
		}
		System.out.println(balance);		

		
		if(menu==4) {
			System.out.println("종료"); break;
		}
		
	}
	}
}


