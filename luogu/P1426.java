package luogu;

import java.util.Scanner;

public class P1426 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int x = input.nextInt();
		double nextSpeed = 7.0;
		double decreaseRate = 0.98;
		double currentPosition = 0.0;
		while (true) {
			if (currentPosition >= (s + x)) {
				System.out.println("n");
				break;
			}
			if (currentPosition >= (s - x)) {
				if ((currentPosition + nextSpeed) > (s + x)) {
					System.out.println("n");
				} else {
					System.out.println("y");
				}
				break;
			}
			currentPosition += nextSpeed;
			nextSpeed = nextSpeed * decreaseRate;
		}
		
	}
}
