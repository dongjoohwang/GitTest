package constrct;

public class ProTest {

	public static void main(String[] args) {
		
		Pro shrimp = new Pro("�����", 1300, "2021-03-02");

		System.out.println("�̸� : " + shrimp.getName());
		System.out.println("���� : " + shrimp.getPri());
		System.out.println("������� : " + shrimp.getLim());
		
		System.out.println("��ǰ 5�� ���� : " + shrimp.total(5));
		System.out.println(shrimp.sale());
	}

}
