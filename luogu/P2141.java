package luogu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P2141 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Integer> numberList = new ArrayList();
		Set<Integer> numberSet = new HashSet();
		for (int i = 0; i < n; i++) {
			int number = input.nextInt();
			numberList.add(number);
			numberSet.add(number);
		}
		numberList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		int count = 0;
		for (int i = 2; i < n; i++) {
			int thisNumber = numberList.get(i);
			for (int j = 0; j < i; j++) {
				int tempNumber = numberList.get(j);
				if ((thisNumber != 2 * tempNumber) && numberSet.contains((thisNumber - tempNumber))) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
