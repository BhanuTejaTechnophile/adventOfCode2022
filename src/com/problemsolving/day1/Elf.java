package com.problemsolving.day1;

import java.util.ArrayList;
import java.util.List;

public class Elf {
	private List<Integer> calories;

	private Elf() {
		this.calories = new ArrayList<>();
	}

	public void add(int calories) {
		this.calories.add(calories);
	}

	public int getTotalColories() {
		return this.calories.stream().reduce(0, Integer::sum);
	}

	public static Elf getInstance() {
		return new Elf();
	}
}
