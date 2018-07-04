package luogu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P1217 {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		findPalinDromePrime(a, b);
		//test
	}
	
	
	public static void findPalinDromePrime(int a, int b) {
		if (a < 10) {
			findOneDigit(a, b);
		}
		if (a < 100 && b >= 10) {
			findTwoDigit(a, b);
		}
		if (a < 1000 && b >= 100) {
			findThreeDigit(a, b);
		}
		if (a < 10000 && b >= 1000) {
			findFourDigit(a, b);
		}
		if (a < 100000 && b >= 10000) {
			findFiveDigit(a, b);
		}
		if (a < 1000000 && b >= 100000) {
			findSixDigit(a, b);
		}
		if (a < 10000000 && b >= 1000000) {
			findSevenDigit(a, b);
		}
		if (a < 100000000 && b >= 10000000) {
			findEightDigit(a, b);
		}
	}
	
	public static void findOneDigit(int a, int b) {
		for (int i = 5; i < 10; i+=2) {
			if (i >= a && i <= b && isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void findTwoDigit(int a, int b) {
		for (int i = 11; i < 100; i+=2) {
			if (i >= a && i <= b && i%11 == 0) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	}
	
	public static void findThreeDigit(int a, int b) {
		for (int i = 1; i < 10; i+=2) {
			for (int j = 0; j < 10; j++) {
				int number = i * 100 + j * 10 + i;
				if (number >= a && number <= b && isPrime(number)) {
					System.out.println(number);
				}
			}
		}
	}
	
	public static void findFourDigit(int a, int b) {
		for (int i = 1001; i < 10000; i+=2) {
			if (i >= a && i <= b && (i%11 == 0)) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	}
	
	public static void findFiveDigit(int a, int b) {
		for (int i = 1; i < 10; i+=2) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					int number = i * 10000 + j * 1000 + k * 100 + j * 10 + i;
					if (number >= a && number <= b && isPrime(number)) {
						System.out.println(number);
					}
				}
			}
		}
	}
	
	public static void findSixDigit(int a, int b) {
		for (int i = 100001; i < 1000000; i+=2) {
			if (i >= a && i <= b && i%11 == 0) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	}
	
	public static void findSevenDigit(int a, int b) {
		for (int i = 1; i < 10; i+=2) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						int number = 1000000 * i + 100000 * j + 10000 * k + 1000 * l + 100 * k + 10 * j + i;
						if (number >= a && number <= b && isPrime(number)) {
							System.out.println(number);
						}
					}
				}
			}
		}
	}
	
	public static void findEightDigit(int a, int b) {
		for (int i = 10000001; i < 100000000; i+=2) {
			if (i >= a && i <= b && i%11 == 0) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrimePlus(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (n%2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n); i+=2) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPalinDromeAndPrime() throws IOException {
		FileWriter writer = new FileWriter("results.txt");
		String palinDromes = "";
		for (int i = 0; i <= 100000000; i++) {
			if (isPalinDrome2(i)) {
				palinDromes += 1 + ",";
			} else {
				palinDromes += 0 + ",";
			}
		}
		palinDromes = palinDromes.substring(0, palinDromes.length() - 1);
		String[] palinDromeNums = palinDromes.split(",");
		System.out.println(palinDromeNums.length);
		for (int i = 0; i < palinDromeNums.length; i++) {
			if (palinDromeNums[i].equals("1") && isPrime(i)) {
				writer.write(i + ",");
			}
		}
		writer.close();
	}
	
	//暴力打表出奇迹
	public static void violentHitTable() {
		try{
			FileWriter writer = new FileWriter("palindromes.txt");
			for (int i = 5; i <= 100000000; i++) {
				if (isPalinDrome(i)) {
					writer.write(i + ",");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public static boolean isPalinDrome2(int n) {
		String reverseStrs = "";
		String num = n + "";
		for (int i = num.length() - 1; i >= 0; i--) {
			reverseStrs += num.charAt(i);
		}
		return Integer.parseInt(reverseStrs) == n;
	}
	
	public static boolean isPalinDrome(int n) {
		int length = String.valueOf(n).length();
		if (length == 1) {
			return true;
		}
		String numStr = n + "";
		int halfLen = length / 2;
		for (int i = 0; i < halfLen; i++) {
			if (numStr.charAt(i) != numStr.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
