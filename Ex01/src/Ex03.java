public class Ex03 {

	public static void main(String[] args) {
	
		int num = 1;
		int num2 = 0;
		int num3 = 0;
		
		num = num+1;	//2
		
		num += 1;		// 3
		
	    num2 = ++num;	// 4,4
		System.out.println(num + "," + num2);
		
		num3 = num++;	// 4,5
		System.out.println(num + "," + num3);	// 5,4
		
		int i=0;
		int j=0;
		
		i+=1;
		j=i;
		
		int m=0;
		int n=0;
		
		n=m;
		m+=1;
	}
}








