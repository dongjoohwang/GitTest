package day0415;

public class Q01 {

	public static void main(String[] args) {
		
		int rate = 1500;
		int lowr = 0;
		
		int age = (int)(Math.random()*99)+1;
		
		System.out.println(age);
		
		if (age>0 && age<=3) {
			lowr = rate%100;
		} else if (age>3 && age<=13) {
			lowr = rate-(rate*1/2);
		} else if(age>13 && age<=19) {
			lowr = rate-(rate*1/4);
		} else if (age>19 && age<65) {
			lowr = rate;
		} else {
			lowr = rate%100;
		}
		System.out.println(lowr);
	}

}
