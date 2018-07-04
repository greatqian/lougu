package luogu;

import java.util.Scanner;

public class P1014 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		int index = 0;
		while (n > sum) {
			index++;
			sum += index;
		}
		if (n == sum) {
			if (index % 2 != 0) {
				System.out.println(1 + "/" + index);
			} else {
				System.out.println(index + "/" + 1);
			}
			return;
		}
		int gap = n - (sum - index) - 1;
		int top, under;
		if (index % 2 != 0) {
			top = index - gap;
			under = 1 + gap;
		} else {
			top = 1 + gap;
			under = index - gap;
		}
		System.out.println(top + "/" + under);
	}

}
