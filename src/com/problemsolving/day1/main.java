package com.problemsolving.day1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Solution solution = new Solution();

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.isEmpty()) {
				solution.addNewElf();
			} else {
				solution.add(Integer.parseInt(line));
			}
		}

		System.out.println(solution.getMaxCalories());
	}

}
