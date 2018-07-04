package luogu;

import java.util.Scanner;

public class P1424 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startDay = input.nextInt();
		long totalDay = input.nextLong();
		
		int swimDay = 0;
		int weekDay = startDay;
		for (int i = 1; i <= totalDay; i++) {
			if (weekDay >= 1 && weekDay <= 5) {
				swimDay++;
			}
			weekDay = (weekDay + 1) % 7;
		}
		System.out.println(swimDay * 250);
	}

}
