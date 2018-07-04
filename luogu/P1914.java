package luogu;

import java.util.Scanner;

public class P1914 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String line = input.nextLine();
		String words = input.nextLine();
		String password = "";
		for (int i = 0; i < words.length(); i++) {
			password += (char) (97 + (words.charAt(i) - 97 + n) % 26);
		}
		System.out.println(password);
	}

}
