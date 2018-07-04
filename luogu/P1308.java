package luogu;

import java.util.Scanner;

import org.junit.Test;

public class P1308 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		word = word.trim();
		word = word.toLowerCase();
		String article = input.nextLine();
		String[] words = article.split(" ");
		int count = 0;
		int firstShowUp = -1;
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].toLowerCase().trim().equals(word)) {
				if (firstShowUp == -1) {
					firstShowUp = index;
				}
				count++;
			}
			index += words[i].length() + 1;
		}
		if (count != 0) {
			System.out.println(count + " " + firstShowUp);
		} else {
			System.out.println("-1");
		}
		
	}
	
	@Test
	public void test01() {
		Scanner input = new Scanner(System.in);
		String aWord = input.next();
		while (aWord != null && !aWord.trim().equals("")) {
			System.out.println(aWord);
			aWord = input.next();
		}
		
		
	}

}
