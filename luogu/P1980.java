package luogu;

import java.util.Scanner;

public class P1980 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num = input.nextInt();
		long count = 0;
		for (int i = 1; i <= n; i++) {
			String numberStrs = "" + i;
			for (int j = 0; j < numberStrs.length(); j++) {
				if (numberStrs.charAt(j) == (num + "").charAt(0)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
