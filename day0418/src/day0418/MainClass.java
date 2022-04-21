package day0418;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		int cnt = 0;
		{
		File file = new File("data/data1.txt");	// 파일 위치 저장
		
		FileInputStream src = new FileInputStream(file);	// 파일 불러오기
		
		Scanner sc = new Scanner(src);
		
		while (sc.hasNext()) {	// true or false
			String tmp = sc.next();
			System.out.printf("%s " , tmp );
			cnt++;
		}
		System.out.println("\ncount : " + cnt);
		System.out.println("===================");
		sc.close();
		src.close();
		
		}
		
		int[] nums = new int[cnt];
		{
			// 배열 공간에 data1.txt 내용 넣기
			
			File file = new File("data/data1.txt");
			
			FileInputStream src = new FileInputStream(file);
			
			Scanner sc = new Scanner(src);
			
//			while (sc.hasNext()) {
//				String tmp2 = sc.next();
//				for (int i = 0; i < 1; i++) {
//					System.out.printf("%s ", tmp2);
//				}
//			}
//			System.out.println();
				
			for (int i = 0; i < cnt; i++) {
				String tmp = sc.next();
				nums[i] = Integer.parseInt(tmp);
			}
			System.out.println(Arrays.toString(nums));
			System.out.println("======================");
			sc.close();
			src.close();
		}
		
		// 배열에서 특정 숫자 찾기
		
		{
//			File file = new File("data/data1.txt");
//			
//			FileInputStream src = new FileInputStream(file);
//			
//			Scanner sc = new Scanner(src);
//			
//			int n = 88;
			
			int idx = -1;
			for (int i = 0; i < cnt; i++) {
				
//				String tmp = sc.next();
//				nums[i] = Integer.parseInt(tmp);
//				if (n==nums[i]) {
//					System.out.println(n + " : " + (i+1)+"번째");
//				} 
					
				if (88 == nums[i]) {
					idx = i;
					break;
				}
			} 
			System.out.println("위치는 " + idx);
			System.out.println("===============");
		}
		
		{
			// index 위치 변경 => 0 <--> 5 위치 교환
			
//			int idx = 0;
//			int temp = 0;
//			for (int i = 0; i < cnt; i++) {
//				if (idx==i) {
//					idx = i;
//					temp = nums[idx];
//					nums[idx] = nums[5];
//					nums[5] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(nums));
//			System.out.println("===============");
			
			int tmp;
			tmp = nums[0];
			nums[0] = nums[5];
			nums[5] = tmp;
			System.out.println(Arrays.toString(nums));
			System.out.println("===============");
		}
		
		{
			// 반복적으로 i <> i+1를 교환
			
				for (int i = 0; i < cnt-1; i++) {
					
					int tmp = 0;
						
					tmp = nums[i];
					nums[i] = nums[i+1];						
					nums[i+1] = tmp;
					
				Thread.sleep(1000);
				
				for(int j=0 ; j<30; j++)
					System.out.println();
				
				for (int j = 0; j < cnt; j++)
					
					if(j == i+1 || j == i+0)
						System.out.printf("[%d] " , nums[j]);
					else	
						System.out.printf("%d ", nums[j]);
				
//			System.out.println(Arrays.toString(nums));
//			System.out.println("===============");
				
				
			}
		}
	}
}




















