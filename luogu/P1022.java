package luogu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class P1022 {
	
	public static void main(String[] args) {
		Set<Character> operatorSet = new HashSet();
		operatorSet.add('+');
		operatorSet.add('-');
		Set<Character> numberSet = new HashSet();
		Character[] numbers = new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		for (Character c: numbers) {
			numberSet.add(c);
		}
		
		Scanner input = new Scanner(System.in);
		String equation = input.nextLine();
		String[] twoPart = equation.split("=");
		int leftNumber = 0, rightNumber = 0;
		int leftCoefficient = 0, rightCoefficient = 0;
		
		Character var = null;
		for (int i = 0; i < equation.length(); i++) {
			char thisChar = equation.charAt(i);
			if (thisChar != '=' && !operatorSet.contains(thisChar) && !numberSet.contains(thisChar)) {
				var = thisChar;
				break;
			}
		}
		
		int index = 0;
		String leftPart = twoPart[0];
		for (int i = 0; i < leftPart.length(); i++) {
			index = i;
			String strs = "" + leftPart.charAt(index);
			index++;
			
			while (index != leftPart.length() && !operatorSet.contains(leftPart.charAt(index))) {
				strs += leftPart.charAt(index);
				index++;
			}
			
			if (!numberSet.contains(strs.charAt(strs.length() - 1))) {
				strs = strs.substring(0, strs.length() - 1);
				if (strs.length() == 0) {
					leftCoefficient += 1;
				}else if (strs.length() == 1 && operatorSet.contains(strs.charAt(0))) {
					strs += "1";
					leftCoefficient += Integer.parseInt(strs);
				} else {
					leftCoefficient += Integer.parseInt(strs);
				}
			} else {
				leftNumber += Integer.parseInt(strs);
			}
			
			i = index - 1;
		}
		
		index = 0;
		String rightPart = twoPart[1];
		for (int i = 0; i < rightPart.length(); i++) {
			index = i;
			String strs = "" + rightPart.charAt(index);
			index++;
			
			while (index != rightPart.length() && !operatorSet.contains(rightPart.charAt(index))) {
				strs += rightPart.charAt(index);
				index++;
			}
			
			if (!numberSet.contains(strs.charAt(strs.length() - 1))) {
				strs = strs.substring(0, strs.length() - 1);
				if (strs.length() == 0) {
					rightCoefficient += 1;
				}else if (strs.length() == 1 && operatorSet.contains(strs.charAt(0))) {
					strs += "1";
					rightCoefficient += Integer.parseInt(strs);
				} else {
					rightCoefficient += Integer.parseInt(strs);
				}
			} else {
				rightNumber += Integer.parseInt(strs);
			}
			
			i = index - 1;
		}
		
		leftCoefficient = leftCoefficient - rightCoefficient;
		rightNumber = rightNumber - leftNumber;
		double result = (double) rightNumber / (double) leftCoefficient;
		// 将-0.000的结果转换为0.000，不然结果不对不能通过
		if (result == 0) {
			result = 0.000;
		}
		System.out.printf("%c=%.3f", var, result);
		
	}
	
}
