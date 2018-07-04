package luogu;

import java.util.Scanner;

public class P1055 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String isbn = input.nextLine();
		String identifyCode = isbn.charAt(isbn.length() - 1) + "";
		String[] part = isbn.split("-");
		int sum = 0;
		int index = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < part[i].length(); j++) {
				sum += Integer.parseInt(part[i].charAt(j) + "") * index;
				index++;
			}
		}
		String result = Math.floorMod(sum, 11) + "";
		if (result.equals("10")) {
			result = "X";
		}
		if (identifyCode.equals(result)) {
			System.out.println("Right");
		} else {
			System.out.println(isbn.substring(0, isbn.length() - 1) + result);
		}
	}

}
