package constrct;

public class ProTest {

	public static void main(String[] args) {
		
		Pro shrimp = new Pro("새우깡", 1300, "2021-03-02");

		System.out.println("이름 : " + shrimp.getName());
		System.out.println("가격 : " + shrimp.getPri());
		System.out.println("유통기한 : " + shrimp.getLim());
		
		System.out.println("제품 5개 가격 : " + shrimp.total(5));
		System.out.println(shrimp.sale());
	}

}
