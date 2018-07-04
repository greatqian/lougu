package luogu;

import java.util.Scanner;

public class P1427 {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		solve();
	}
	
	public static void solve() {
		long num = input.nextLong();
		if (num == 0) {
			return;
		}
		solve();
		System.out.print(num + " ");
	}

}
