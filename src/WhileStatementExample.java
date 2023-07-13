
public class WhileStatementExample {
	
	
	public static void main(String[] args) {
		
		int dice1 =0;
		int dice2 =0;
		
		dice1 =(int)(Math.random()*6 + 1);// 한 번은 던져야 하니.. 
		 dice2 =(int)(Math.random()*6 + 1);
		 System.out.println(dice1);
		 System.out.println(dice2);
		
		
		// while(dice1+dice2 !=5)  
		 for(;dice1+dice2 !=5;){
			 dice1 =(int)(Math.random()*6 + 1);
			 dice2 =(int)(Math.random()*6 + 1);
			 System.out.println(dice1);
			 System.out.println(dice2);
			 
		 }
		
		System.out.println("End!");
	}
		
	
	
	
	public static void main2(String[] args) {

		int dice1 =0;
		int dice2 =0;
		
		
		
		 do {
			 dice1 =(int)(Math.random()*6 + 1);
			 dice2 =(int)(Math.random()*6 + 1);
			 System.out.println(dice1);
			 System.out.println(dice2);
			 
		 } while(dice1+dice2 !=5); 
		
		System.out.println("End!");
	}
	

	public static void main1(String[] args) {

		int dice =0;

		
		while(dice !=5) {
			dice =(int)(Math.random()*6 + 1);
			System.out.println(dice);
		}
		
		System.out.println("End!");
	}

}
