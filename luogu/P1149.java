package luogu;

import java.util.Scanner;

public class P1149 {
	
	public static int[] sticks = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		for (int i = 0; i <= 1111; i++) {
			for (int j = 0; j <= 1111; j++) {
				int sum = i + j;
				int stickSum = getTotalSticks(i, j, sum);
				if (stickSum == n) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static int getTotalSticks(int i, int j, int sum) {
		int count = 0;
		String numStr1 = i + "";
		String numStr2 = j + "";
		String numStr3 = sum + "";
		for (int k = 0; k < numStr1.length(); k++) {
			count += sticks[Integer.parseInt(numStr1.charAt(k) + "")];
		}
		for (int k = 0; k < numStr2.length(); k++) {
			count += sticks[Integer.parseInt(numStr2.charAt(k) + "")];
		}
		for (int k = 0; k < numStr3.length(); k++) {
			count += sticks[Integer.parseInt(numStr3.charAt(k) + "")];
		}
		count = count + 4;
		return count;
	}

}
