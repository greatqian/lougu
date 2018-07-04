package luogu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2089 {
	
	public static int count = 0;
	public static int n;
	public static List<String> solutions = new ArrayList();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		if (n < 10 || n > 30) {
			System.out.println(0);
			return;
		}
		int[] arr = new int[10];
		findSolutions(arr, 0);
		if (count == 0) {
			System.out.println(0);
		} else {
			System.out.println(count);
			for (int i = 0; i < solutions.size(); i++) {
				String solution = solutions.get(i);
				for (int j = 0; j < solution.length(); j++) {
					System.out.print(solution.charAt(j) + (j == (solution.length() - 1) ? "\n" : " "));
				}
			}
		}
	}
	
	public static void findSolutions(int[] arr, int index) {
		if (index == arr.length) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			if (sum == n) {
				String solution = "";
				for (int i = 0; i < arr.length; i++) {
					solution += arr[i];
				}
				solutions.add(solution);
				count++;
			}
			return;
		} else {
			for (int i = 1; i <= 3; i++) {
				arr[index] = i;
				int nextIndex = index + 1;
				findSolutions(arr, nextIndex);
			}
		}
		
	}

}
