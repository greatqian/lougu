package luogu;

import java.util.Scanner;

public class P1046 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] appleHeights = new int[10];
		for (int i = 0; i < 10; i++) {
			appleHeights[i] = input.nextInt();
		}
		int armHeight = input.nextInt();
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (appleHeights[i] <= (armHeight + 30)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
