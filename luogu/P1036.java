package luogu;

import java.util.Scanner;

public class P1036 {
	
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		getPrimSumCount(numbers, k, 0, new int[k], 0);
		System.out.println(count);
	}
	
	public static void getPrimSumCount(int[] a, int n, int begin, int b[], int index) {
		if (n == 0) {
			int sum = 0;
			for (int i = 0; i < b.length; i++) {
				sum += b[i];
			}
			if (isPrime(sum)) {
				count++;
			}
			return;
		}
		for (int i = begin; i < a.length; i++) {
			b[index] = a[i];
			getPrimSumCount(a, n - 1, i + 1, b, index + 1);
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

}
