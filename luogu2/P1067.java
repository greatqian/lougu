package luogu2;

import java.util.Scanner;

public class P1067 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] coefficients = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			coefficients[i] = input.nextInt();
		}
		
		boolean startFlag = false;
		String result = "";
		for (int i = 0; i <= n; i++) {
			if (coefficients[i] == 0) {
				continue;
			}
			if (!startFlag) {
				if (n - i == 0) {
					result += coefficients[i];
				} else {
					result += getCoefficientStr(coefficients[i], true) + "x" + getPowStr(n - i);
				}
				startFlag = true;
			} else if (n - i == 0) {
				result += (coefficients[i] > 0 ? "+" : "" ) + coefficients[i];
			} else {
				result += getCoefficientStr(coefficients[i], false) + "x" + getPowStr(n - i);
			}
			
		}
		System.out.println(result);
	}
	
	public static String getCoefficientStr(int coe, boolean isStart) {
		if (coe == 1) {
			return "" + (isStart ? "" : "+");
		} else if (coe == -1) {
			return "-";
		} else if (coe < 0){
			return "" + coe;
		} else {
			return "" + (isStart ? "" : "+") + coe;
		}
	}
	
	public static String getPowStr(int pow) {
		if (pow == 1) {
			return "";
		} else {
			return "^" + pow;
 		}
	}

}
