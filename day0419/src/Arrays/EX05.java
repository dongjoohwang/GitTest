package Arrays;

public class EX05 {

	public static void main(String[] args) {
		/*
		 * 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지
		 * 계산해서 출력하라.
		 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다. (1)에 알맞은
		 * 코드를 완성하시오.
		 * (hint) 나눗셈 연산자와 나머지 연산자 사용
		 */

		int[] coin = {500,100,50,10};
		int money = 2680;
		int money2 = money;
		System.out.println(money);
		
//		int cnt = 0;
//		int rest = 0;
//		for (int i = 0; i < coin.length; i++) {
//			cnt = money/coin[i];
//			rest = money%coin[i];
//			money = rest;
//			System.out.println(coin[i] + " : " + cnt+"개");
//			
//		}
		
		int rest = 0;
		for (int i = 0; i < coin.length; i++) {
			int num = money/coin[i];
			money %= coin[i];
			System.out.println(coin[i] + "원 : " + num);
			
		}
		
	}

}









