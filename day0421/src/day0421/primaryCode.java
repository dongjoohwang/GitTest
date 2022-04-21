package day0421;

//import java.util.Arrays;

//import java.util.Scanner;

//# 강의 내용 => 핵심 코드 정리
//

/*
 * 	day0420 - ex03as
 * 
 *   int fee=2500;

		int age = input();
		double rate = feeCalc(age);
		output(age, fee, rate);
	}
	
	static int input() {
		int age=0;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		return age;
	}

	static double feeCalc(int age) {
		double rate=0.0;
		if (age>=65) {
			rate=0.0;
		} else if (age>=20) {
			rate=1;
		} else if (age>=14) {
			rate=0.75;
		} else if (age>=4) {
			rate=0.5;
		} else {
			rate=0.0;
		}
		return rate;
		
	}
	
	static void output(int age, int fee, double rate) {
		System.out.println(age + "세 요금은 " + (int)(fee*rate)+"원");
	}
}
	
	day0420 - ex04  / 선택정렬 (오름차순, 내림차순)
	
	for (int i = 0; i < num.length-1; i++) {
			int id = i;  // id=0
			for (int j = i+1; j < num.length; j++) { // num[0]을 비교할 필요가 없기 때문에 i+1을
													// 시작값으로 설정한다.
				if (num[id]>num[j])		// j는 num[1]에서 num[4]까지 돈다.
										// 즉, num[id]는 num[1],[2],[3],[4]까지의 값과 모두 비교하는 것이다.
					
										// ex)num[id(=0)]의 값이 num[1]보다 크면 num[id]는 num[1]로 바뀐다.
										// 마찬가지로, num[id]가 num[1]로 바뀌었을때, num[2]와 비교해서 
										// num[2]의 값이 더 작으면 num[id]값은 num[2]값으로 바뀐다.
										// 이 과정에서 num[4]까지의 값을 비교하여, 가장 작은 인덱스의 값이
										// num[id]에 저장된다. 
					id=j;				// => num[id] = num[j]
				
				}
				if (id != i) {
					int tmp = num[id];
					num[id] = num[i];
					num[i] = tmp;
				}
				
			
			System.out.println(i+1+"회전 : " + Arrays.toString(num));
	

 */


//	day0419 - ex07
//
//	/* 출력된 숫자가 배열에 몇 개 들어있는지 구하기
//		 * 랜덤 함수
//		 * ex) 4446579753
//		 * 0 : 0 
//		 * 1 : 1
//		 * ....
//		 * 9 : 1
//		 * 
//		 */
//
//	for (int i = 0; i < num.length; i++) {
//			num2[num[i]]++;		// num2[i] 값에 num[i]의 값을 넣고, 
//								// num[i]의 값(0~9)이 num2[i]에도 들어있을 경우 갯수를 카운팅한다.
//		}
//		for (int i = 0; i < num2.length; i++) {
//			System.out.println(i + " : " + num2[i]+"개");
//		}
//	}
//}
//
//	day0419 - ex06
//
//	/*
//		 * 배열 + 랜덤 사용(1~10) => 10개 출력
//		 * 크기 순으로 재정렬(단, 결과값만이 아닌 과정값도 출력) 
//		 * 
//		 * 1344213843
//		 * 1342134438
//		 * 1321344348
//		 * 1213343448
//		 * 1123344448
//		 */
//
//		int temp = 0;
//		
//		for (int i = 0; i < num.length; i++) {
//			boolean ch = false;
//			for (int j = 0; j < num.length-1; j++) {
//				if (num[j] > num[j+1]) {
//					temp = num[j];
//					num[j] = num[j+1];
//					num[j+1] = temp;
//					ch = true;
//				}
//			}
//			if (!ch) break;		// 중첩 for문을 돌면서 ch 값이 모두 false가 나올 경우 반복문을 빠져나온다.
//								// (=자리 바꿈이 더 이상 발생하지 않을 경우 반복문을 빠져나와서 최종값을 출력한다.)
//								
//								
//	day0419 - Arrays ex08
//
//		// 선택정렬 (오름차순, 내림차순)
//
//		for (int i = 0; i < data.length-1; i++) {
//			int minid = i;
//			for (int j = i+1; j < data.length; j++) {
//				if (data[minid]>data[j]) {
//					minid = j;
//				}
//			}
//			int tmp = data[minid];
//			data[minid] = data[i];
//			data[i] = tmp;
//		}
//	
//	day0419 - Arrays ex07
//	
//		/*
//		 * 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
//		 * 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고
//		 * 출력하는 프로그램을 완성하시오.
//		 */
//	
//		int[][] rs = new int[score.length+1][score[0].length+1];
//		
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				rs[i][j] = score[i][j];
//				rs[i][rs[0].length-1] += score[i][j];
//				rs[rs.length-1][j] += score[i][j];
//				rs[rs.length-1][rs.length-3] += score[i][j];
//			}
//			System.out.println();
//		}
//	
//	day0419 - Arrays ex06
//		/*
//		 * 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서
//		 * 개수만큼 '*'를 찍어서 그래프를 그리는 프로그램이다.
//		 * 알맞은 코드를 넣어서 완성하시오.
//		 */							
//		/*
//		 * 3***
//		 * 2**
//		 * 2**
//		 * 4****
//		 */						
//								
//		int[] as = {1,4,4,3,1,4,4,2,1,3,2,};
//		
//		int[] ct = new int[4];
//		
//		for (int i = 0; i < as.length; i++) {
//			ct[as[i]-1]++;
//		}
//		for (int i = 0; i < ct.length; i++) {
//			System.out.print(ct[i]);
//			for (int j = 0; j < ct[i]; j++) {
//			System.out.print("*");	
//			}
//			System.out.println();
//		}							
//	
//		
//	day0419 - Arrays ex05	
//		/*
//		 * 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
//		 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지
//		 * 계산해서 출력하라.
//		 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다. (1)에 알맞은
//		 * 코드를 완성하시오.
//		 * (hint) 나눗셈 연산자와 나머지 연산자 사용
//		 */						
//		
//		int rest = 0;
//		for (int i = 0; i < coin.length; i++) {
//			int num = money/coin[i];
//			money %= coin[i];
//			System.out.println(coin[i] + "원 : " + num);
//			
//		}				
//							
//	day0419 - Arrays ex03
//	
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				total += arr[i][j];
//				cnt++;
//			}
//			
//			ag = total / (float)cnt;
//		}
//
//	day0419 - Arrays ex02
//	
//		for (int i = 0; i < score.length; i++) {
//			int sum=0;
//			double ag=0;
//			System.out.print(i + "\t");
//			kort += score[i][0];
//			engt += score[i][1];
//			matht += score[i][2];
//			for (int j = 0; j < score[i].length; j++) {
//				
//				sum += score[i][j];
//				
//				System.out.print(score[i][j] + "\t");
//			}
//
//
//	day0415 - Q3as
//	
//			*****
//			 ***
//			  *
//			 ***
//			*****	
//
//		 for (int i = 0; i < 3; i++) {
//			for (int j = 4; j > 4-i; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 5; j > (i*2); j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		 
//		 for (int i = 1; i < 3; i++) {
//			for (int j = 0; j < 2-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < (i*2)+1; j++) {
//				System.out.print("*");
//			}
//		System.out.println();
//	   }
//
//
//			 *
//			**
//		   ***
//		  ****
//		 *****
//
//		for (int i = 0; i < 5; i++) {
//	   		for (int j = 0; j < 4-i; j++) {
//				System.out.print(" ");
//			}
//	   		for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//	   		System.out.println();
//	   	}
//
//
//		day0412 - ex03
//
//		  // 입력, 출력 0
//		  public static void main(String[] args) {
//      
//		  int num = add(10,20);
//		  
//		  System.out.println(num);
//		  
//	   }
//	   
//	   static int add(int i,int j) {
//		  
//		  return i+j;
//		  
//	   }						
//				
//		// 입력 0, 출력 x
//		
//		  public static void main(String[] args) {
//      
//		  add(10,20);
//	   }
//	   
//	   static void add(int i,int j) {
//		  
//		  System.out.println(i+j);
//		  
//	   }
//		
//		// 입력 x, 출력 0
//		
//		 public static void main(String[] args) {
//      
//		  int num = add();
//		  
//		  System.out.println(num);
//	   }
//	   
//	   static int add() {
//		  
//		  return 10+20;
//		  
//	   }
//
//		// 입력, 출력 x
//		
//		public static void main(String[] args) {
//      
//		  add();
//	   }
//	   
//	   static void add() {
//		  System.out.println(30);
//	   }
//
//
//
//
//
//
//
//
//				
//								
//								
//								