
public class ExerciseCondition4 {

	public static void main(String[] args) {

		//1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		
//		int sum =0;
//		
//		for(int i =1; i<=20; i++) {
//			if(i%2!=0 || i%3!=0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		
		
		int i,j;
		int s1=0 , s2=0, s3=0;
		
		for(i=1;i<200;i+=2) {			
			s1+=i;				  
		}
		
		for( j =2;j<200;j+=2) {
			s2+=j;
			
		}
		
		s3=s1+(s2*-1);
		
	}

}
