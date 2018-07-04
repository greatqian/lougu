package luogu;

import java.util.Scanner;

public class P1579 {
	
	public static int[] primes = new int[20000];
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		getPrimes(n);
		
		int[] result = new int[3];
		
		end:
		for (int i = 2; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (primes[i] == 1 && primes[j] == 1) {
					if ((i + j) < n && primes[n-i-j] == 1) {
						result[0] = i;
						result[1] = j;
						result[2] = n-i-j;
						break end;
					}
				}
			}
		}
		
		System.out.println(result[0] + " " + result[1] + " " + result[2]);

		
	}
	
	public static void getPrimes(int n) {
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				primes[i] = 1;
			}
		}
	}
	
	public static boolean isPrime(int n) {
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

}
