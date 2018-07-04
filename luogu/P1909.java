package luogu;

import java.util.Scanner;

public class P1909 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int needCount = input.nextInt();
		long minSpend = 0;
		for (int i = 0; i < 3; i++) {
			int count = input.nextInt();
			int price = input.nextInt();
			long thisKindPrice = (needCount % count == 0 ? needCount / count : (needCount / count) + 1) * price;
			if (minSpend == 0 || minSpend > thisKindPrice) {
				minSpend = thisKindPrice;
			}
		}
		System.out.println(minSpend);
	}

}
