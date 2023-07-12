
public class IfstatementExample {
	
	public static void main1(String[] args) {
		int jumsu =(int)(Math.random()*51+50);
		char grade;
		//int jumsu =59;
		if(jumsu>=90) grade = 'A'; //System.out.println(jumsu+"A");
		else if(jumsu>=80)  grade = 'B';//System.out.println(jumsu+"B");
		else if(jumsu>=70)  grade = 'C';//System.out.println(jumsu+"C");
		else if(jumsu>=60)  grade = 'D';//System.out.println(jumsu+"D");
		else  grade = 'F';//System.out.println("F");
		
		System.out.printf("%d  %c",jumsu,grade);
	}


	public static void main(String[] args) {

		int num =(int)(Math.random()*100-50);
		
		
		if(num >0) {
			System.out.println(num + "양수");
		}
		else if(num==0) {
			System.out.println("0입니다.");
		}
		else System.out.println(num + "움수");
	
	}

	public static void main3(String[] args) {

		int num2 = 100;
		
		if(num2%2 ==0) 
			System.out.println("짝수입니다.");
		else 
			System.out.println("홀수입니다.");
	}


	public static void main2(String[] args) {

		int num = 100;
		
		if(num%2 ==0) {
			System.out.println("##########");
			System.out.println("짝수입니다.");
			System.out.println("##########");
		}		
		else {
			System.out.println("@@@@@@@@@@@");
			System.out.println("홀수입니다.");
			System.out.println("@@@@@@@@@@@");
		}
	}
}
