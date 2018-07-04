package luogu2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class P1540 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		Set<Integer> set = new HashSet();
		int m = input.nextInt();
		int n = input.nextInt();
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			int word = input.nextInt();
			if (!set.contains(word)) {
				count++;
				if (q.size() < m) {
					q.offer(word);
					set.add(word);
				} else {
					int deleteNum = q.poll();
					q.offer(word);
					set.add(word);
					set.remove(deleteNum);
				}
			}
		}
		System.out.println(count);
	}

}
