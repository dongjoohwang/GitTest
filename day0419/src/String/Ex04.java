package String;

public class Ex04 {

	public static void main(String[] args) {
		
		char[] hex = {'C','A','F','E'};		// 아스키코드
		
		String[] binary = {"0000", "0001", "0010", "0011"
						,  "0100", "0101", "0110", "0111"
						,  "1000", "1001", "1010", "1011"
						,  "1100", "1101", "1110", "1111"};
		
		String rs = "";
		
		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') {
				rs += binary[hex[i]-'0'];
			} else {
				rs += binary[hex[i]-'A'+10];
				
				// A=10 B=11 C=12....F=15
				// 'C'-'A'+10 = 12(1100)
				// 'A'-'A'+10 = 10(1010)
				// 'F'-'A'+10 = 15(1111)
				// 'E'-'A'+10 = 14(1110)
				// 12(1100) / 10(1010) / 15(1111) / 14(1110)
				// 1100101011111110
			}
		}
		System.out.println("hex : " + new String(hex));
		System.out.println("binary : " + rs);
	}

}
