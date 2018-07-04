package luogu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P1598 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Set<Character> wordSet = new HashSet();
		for (int i = 0; i < words.length(); i++) {
			wordSet.add(words.charAt(i));
		}
		int[] wordCount = new int[100];
		String[] inputLines = new String[4];
		for (int i = 0; i < 4; i++) {
			inputLines[i] = input.nextLine();
		}
		for (String s: inputLines) {
			for (int i = 0; i < s.length(); i++) {
				char word = s.charAt(i);
				if (wordSet.contains(word)) {
					wordCount[word]++;
				}
			}
		}
		int maxCount = 0;
		for (int i = 0; i < words.length(); i++) {
			if (wordCount[words.charAt(i)] > maxCount) {
				maxCount = wordCount[words.charAt(i)];
			}
		}
		String[] chartLines = new String[maxCount + 1];
		for (int i = 0; i < chartLines.length; i++) {
			String thisLine = "";
			if (i == 0) {
				for (int j = 0; j < words.length(); j++) {
					thisLine += words.charAt(j) + (j == (words.length() - 1) ? "" : " ");
				}
			} else {
				for (int j = 0; j < words.length(); j++) {
					thisLine += (wordCount[words.charAt(j)] >= i ? "*" : " ");
					thisLine += (j == (words.length() - 1) ? "" : " ");
				}
			}
			chartLines[i] = thisLine;
		}
		for (int i = chartLines.length - 1; i >= 0; i--) {
			System.out.println(chartLines[i]);
		}
	}

}
