package String;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
//		1. 문자열 검색
//		파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};

		int cnt = 0;
		
		for (int i = 0; i < files.length; i++) {
			String st = files[i];
			boolean end = st.endsWith("jpg");
			if (end==true) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
//		2. 영 단어 퀴즈
//		영어 단어 퀴즈를 낸다.
//		아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
//		100점 만점 기준으로 몇점인지 출력한다.
//		1. 승리을 영어로 입력하세요 :
//		2. 사랑을 영어로 입력 하세요 :
//		3. 컴퓨터를 영어로 입력 하세요 :
//		4. 노트북을 영어로 입력하세요 :
//		입력 예시
//
//		1. 승리을 영어로 입력하세요 :victory
//		2. 사랑을 영어로 입력 하세요 :lobe
//		3. 컴퓨터를 영어로 입력 하세요 :computer
//		4. 노트북을 영어로 입력하세요 :notebook
		
//		Scanner sc = new Scanner(System.in);
//
//		int score = 0;
//		
//		System.out.print("승리을 영어로 입력하세요 : ");
//		String q1 = sc.next();
//		
//		if (q1.equals("victory")) {
//			score+=25;
//		}
//		
//		System.out.print("사랑을 영어로 입력하세요 : ");
//		String q2 = sc.next();
//		
//		if (q2.equals("love")) {
//			score+=25;
//		}
//		
//		System.out.print("컴퓨터를 영어로 입력하세요 : ");
//		String q3 = sc.next();
//		
//		if (q3.equals("computer")) {
//			score+=25;
//		}
//		
//		System.out.print("노트북을 영어로 입력하세요 : ");
//		String q4 = sc.next();
//		
//		if (q4.equals("notebook")) {
//			score+=25;
//		}
//		System.out.println(score);
		
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		
		int cot=0;
		
		String[] names = memberStr.split(":");
		
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
//			System.out.print(name + " ");
			boolean same = false;
			
			if (name.equals("")) { // 동명이인으로 체크되서 빈칸인 경우 skip
				continue;
			}
			
			for (int j = i+1; j < names.length; j++) {
				if (name.equals(names[j])) {
					same=true;
					names[j] = "";
				}
			}
			if (same) {
				cot++;
			}
		}
		
		System.out.println(cot);
	}

}











