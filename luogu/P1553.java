package luogu;

import java.util.Scanner;

public class P1553 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numberStr = input.nextLine();
		if (numberStr.indexOf(".") != -1) {
			String[] parts = numberStr.split("[.]");
			String leftPart = "";
			for (int i = parts[0].length() - 1; i >=0 ; i--) {
				leftPart += parts[0].charAt(i);
			}
			String rightPart = "";
			for (int i = parts[1].length() - 1; i >=0 ; i--) {
				rightPart += parts[1].charAt(i);
			}
			Long left = Long.parseLong(leftPart);
			while (rightPart.charAt(rightPart.length() - 1) == '0' && rightPart.length() > 1) {
				rightPart = rightPart.substring(0, rightPart.length() - 1);
			}
			System.out.println(left + "." + rightPart);
		} else if (numberStr.indexOf("/") != -1) {
			String[] parts = numberStr.split("/");
			String leftPart = "";
			for (int i = parts[0].length() - 1; i >=0 ; i--) {
				leftPart += parts[0].charAt(i);
			}
			String rightPart = "";
			for (int i = parts[1].length() - 1; i >=0 ; i--) {
				rightPart += parts[1].charAt(i);
			}
			Long left = Long.parseLong(leftPart);
			Long right = Long.parseLong(rightPart);
			System.out.println(left + "/" + right);
		} else if (numberStr.indexOf("%") != -1) {
			String numberPart = numberStr.substring(0, numberStr.indexOf("%"));
			String str = "";
			for (int i = numberPart.length() - 1; i >= 0; i--) {
				str += numberPart.charAt(i);
			}
			Long percentNumber = Long.parseLong(str);
			System.out.println(percentNumber + "%");
		} else {
			String str = "";
			for (int i = numberStr.length() - 1; i >=0; i--) {
				str += numberStr.charAt(i);
			}
			Long number = Long.parseLong(str);
			System.out.println(number);
		}
		
	}
	
}
