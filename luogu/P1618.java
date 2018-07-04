package luogu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class P1618 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextInt();
		double b = input.nextInt();
		double c = input.nextInt();
		int count = 0;
		for (int i = 123; i <= 987; i++) {
			double num1 = i;
			double num2 = i * (b/a);
			if ((int)num2 != num2 || num2 > 987) {
				continue;
			}
			double num3 = i * (c/a);
			if ((int)num3 != num3 || num3 > 987) {
				continue;
			}
			if (isNumberUniqueAndNotContainsZero((int)num1, (int)num2, (int)num3)) {
				System.out.println((int)num1 + " " + (int)num2 + " " + (int)num3);
				count++;
			}
			
		}
		if (count == 0) {
			System.out.println("No!!!");
		}
		
	}
	
	public static boolean isNumberUniqueAndNotContainsZero(int num1, int num2, int num3) {
		String nums = "" + num1 + num2 + num3;
		Set<Character> numSet = new HashSet<>();
		for (int i = 0; i < nums.length(); i++) {
			if ('0' != nums.charAt(i) && !numSet.contains(nums.charAt(i))) {
				numSet.add(nums.charAt(i));
			} else {
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void test01() {
		double a = 1.00;
		double b = 1.000;
		double c = 1;
		double e = 3;
		double d = (double) (int) 1.001;
		double f = 1.00;
		System.out.println((a == b) + "" + (b == c) + " " + d + "c=" + c + " 1/3=" + (c/e));
		System.out.println((int)f == f);
	}

}
