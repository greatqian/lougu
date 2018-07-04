package luogu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P1008 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 123; i <= 329; i++) {
			int mid = i * 2;
			int big = i * 3;
			if (!checkRight(i, mid, big)) {
				continue;
			}
			System.out.println(i + " " + mid + " " + big);
		}
	}
	
	public static boolean checkRight(int small, int mid, int big) {
		String strs = "" + small + mid + big;
		Set<Character> wordSet = new HashSet();
		for (int i = 0; i < strs.length(); i++) {
			Character c = strs.charAt(i);
			if (c == '0') {
				return false;
			}
			if (!wordSet.contains(c)) {
				wordSet.add(c);
			} else {
				return false;
			}
		}
		return true;
	}

}
