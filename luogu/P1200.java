package luogu;

import java.util.Scanner;

public class P1200 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String starName = input.nextLine();
		int starNumber = 1;
		for (int i = 0; i < starName.length(); i++) {
			starNumber = starNumber * (starName.charAt(i) - 64);
		}
		String teamName = input.nextLine();
		int teamNumber = 1;
		for (int i = 0; i < teamName.length(); i++) {
			teamNumber = teamNumber * (teamName.charAt(i) - 64);
		}
		if (Math.floorMod(starNumber, 47) == Math.floorMod(teamNumber, 47)) {
			System.out.println("GO");
		} else {
			System.out.println("STAY");
		}
		
	}

}
