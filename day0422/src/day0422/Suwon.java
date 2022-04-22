package day0422;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Suwon {

	public static void main(String[] args) throws IOException {
		
		int count = 0;
		{
			File file = new File("data/suwon2.txt");
			FileInputStream infile = new FileInputStream(file);
			
			Scanner sc = new Scanner(infile);
			
			while (sc.hasNextLine()) {	// 읽어올 데이터가 있는가
				sc.nextLine();
				count++;
			}
			count--;
			System.out.println("count : " + count);
			sc.close();
			infile.close();
		}
		
		String[] region = new String[count];	// 시도명
		String[] city = new String[count];	// 시군구명
		String[] district = new String[count];	// 구청명
		String[] dong = new String[count];	// 법정동명
		int[] variety = new int[count];	// 등록품종수
		int[] howmany = new int[count];	// 등록개체수
		int[] owner = new int[count];	// 소유자수
		String[] office = new String[count];	// 관리부서명
		String[] callnum = new String[count];	// 관리부서연락처
		String[] data = new String[count];	// 데이터기준일자
		{
			File file = new File("data/suwon2.txt");
			FileInputStream infile = new FileInputStream(file);
			
			Scanner sc = new Scanner(infile);
			int total=0;
			sc.nextLine();	// 첫번째 줄 읽어서 버린다.
			
			for (int i = 0; i < count; i++) {
				String line = sc.nextLine();
				
				String[] tokens = line.split(",");
				region[i] = tokens[0];
				city[i] = tokens[1];
				district[i] = tokens[2];
				dong[i] = tokens[3];
				variety[i] = Integer.parseInt(tokens[4]);
				total += variety[i];
			}
			
			for (int i = 0; i < count; i++) {
				System.out.printf("%s %s %s %s %d\n",
				region[i],city[i],district[i],dong[i],variety[i]);
			}
			System.out.println("total = " + total);
		}
	}

}










