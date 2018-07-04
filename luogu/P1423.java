package luogu;

import java.util.Scanner;

public class P1423 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double i = input.nextDouble();
		double nextStep = 2.0;
		int count = 0;
		double totalLength = 0.0;
		while (totalLength < i) {
			totalLength += nextStep;
			nextStep = nextStep * 0.98;
			count++;
		}
		System.out.println(count);
	}

}
