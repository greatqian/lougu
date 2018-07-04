package luogu;

import java.util.Scanner;

public class P1089 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int leftCount = 0;
		int giveMother = 0;
		for (int i = 0; i < 12; i++) {
			int budget = input.nextInt();
			if ((leftCount + 300) < budget) {
				System.out.println("-" + (i + 1));
				return;
			}
			int monthLeft = leftCount + 300 - budget;
			if (monthLeft / 100 != 0) {
				giveMother += 100 * (monthLeft / 100);
				leftCount = monthLeft - 100 * (monthLeft / 100);
			} else {
				leftCount = monthLeft;
			}
		}
		double finalMoney = leftCount + 1.2 * giveMother;
		System.out.println((int) finalMoney);
	}

}
