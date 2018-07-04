package luogu;

import java.util.Scanner;

public class P1035 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double i = input.nextDouble();
		int index = 1;
		double sum = 0.0;
		while (sum <= i) {
			sum = sum + (1.0 / index);
			index++;
		}
		System.out.println(index - 1);
	}

}
