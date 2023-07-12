
public class GugudanExample {

	public static void main(String[] args) {
		int count =0;
		
		for(int x=1; x<=100; x++) {
			for(int y=1; y<=100; y++) {
				for(int z=1; z<=100; z++) {
					if((x*x)+(y*y)==(z*z)) {
						count++;
						System.out.printf("%d+%d=%d\n",x*x,y*y,z*z);
					}
				}
			}
		}
		System.out.println(count);
	}
	
	
	public static void main3(String[] args) {
		
		int i ,j;
		
		for(i=2; i<10; i++) {
			System.out.printf("=====%d단======\n",i);
			for(j=1; j<10; j++) {
				//System.out.printf("%2d * %2d = %2d \n",i,j,i*j);
				if(i*j%2==0) {
					System.out.printf("%2d * %2d = %2d \n",i,j,i*j);
				}
			}
			System.out.println("\n");
		}
	}

}
