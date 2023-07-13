
public class BreakStatementExample {
// 1에서 100까지의 랜덤숫자를 더한다. 언제까지..?
	public static void main(String[] args) {
		int choice = (int)(Math.random()*100+1);
		int sum =0;
		int count;
		System.out.println("choice = "+choice);
		
		for(int i=1; i<100;i++) {
			sum += i;
			if(i == choice) break; // 가장 가까운 반복문을 끝낸다. 
			
		}
		
		
	}

}
