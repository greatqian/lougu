package luogu;

import java.util.Scanner;

public class P1085 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mostUpsetDay = 0;
		int mostUpsetTotalTime = 0;
		for (int i = 0; i < 7; i++) {
			int schoolTime = input.nextInt();
			int otherTime = input.nextInt();
			int totalTime = schoolTime + otherTime;
			if (totalTime > 8 && totalTime > mostUpsetTotalTime) {
				mostUpsetTotalTime = totalTime;
				mostUpsetDay = i + 1;
			}
		}
		System.out.println(mostUpsetDay);
	}

}
