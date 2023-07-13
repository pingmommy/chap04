
public class TriangleExample {
	
public static void main(String[] args) {

		
		for(int i=0;i<5;i++) {
			
			for(int k=0;k<5-i;k++) {
				System.out.print(" ");
		}
			for(int j=0;j<i+1;j++) {
				
				 System.out.print("*");
		  }
			System.out.print("");

			for(int j=0;j<=i;j++) {
				System.out.print("*");
		}
			System.out.println();
	}

}
	
	
	
	// 역정삼각형만들기
	public static void main2(String[] args) {

		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				
				 System.out.print(" ");
		  }
			for(int k=0;k<5-i;k++) {
				System.out.print("*");
		}
			
			System.out.println();
	}

}
	
	
	
	public static void main3(String[] args) {

		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
		}
			System.out.println();
	}

}
	

	public static void main1(String[] args) {

		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
		}
			
			System.out.println();
	}

}
}
