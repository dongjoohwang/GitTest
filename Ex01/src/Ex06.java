
public class Ex06 {

	public static void main(String[] args) {
		
//		float pi = 3.14159f;
//		
//		float rs = (int)(pi*1000)/1000.0f;
//		
//		System.out.println(rs);
//
//		float rs2 = (int)(pi*1000+0.5f)/1000f;
//		
//		System.out.println(rs2);
		
		double pi = 3.141592;
		double shortpi = pi*1000;
		
		System.out.println(shortpi);
		
		shortpi = Math.round(pi*1000);
		
		System.out.println(shortpi);
		
		shortpi = Math.round(pi*1000)/1000.0;
		System.out.println(shortpi);
	}

}
