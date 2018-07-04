package luogu;

import java.util.Scanner;

import org.junit.Test;

public class P1307 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String prefix = "";
		String numStr = "" + n;
		if (n <= 0) {
			prefix = "-";
			numStr = numStr.substring(1);
		}
		String reversed = "";
		for (int i = 0; i < numStr.length(); i++) {
			reversed += numStr.charAt(numStr.length() - 1 - i);
		}
		reversed = prefix + reversed;
		long result = Long.parseLong(reversed);
		System.out.println(result);
	}

}
