package luogu;

import java.util.Scanner;

public class KaisaCipher {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入密文");
		String cipher = input.nextLine();
		System.out.println("解密后的明文是");
		for (int i =0; i < cipher.length(); i++) {
			char convertedLetter;
			int letterAscii = (int) cipher.charAt(i);
			if (letterAscii < 68) {
				convertedLetter = (char) (88 + (letterAscii - 65));
			} else {
				convertedLetter = (char) (letterAscii - 3);
			}
			System.out.print(convertedLetter);
		}
	}

}
