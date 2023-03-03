package com.problemsolving.day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
	private List<Elf> elves;

	Solution() {
		this.elves = new ArrayList<>();
		this.addNewElf();
	}

	public void addNewElf() {
		this.elves.add(Elf.getInstance());
	}

	public void add(int calories) {
		this.elves.get(this.elves.size() - 1).add(calories);
	}

	public int getMaxCalories() {
		return this.elves.stream().map(e -> e.getTotalColories()).reduce(0, Integer::max);
	}

	public int getTopThreeMaxCaloriesSum() {
		return this.elves.stream().sorted(Comparator.comparing(Elf::getTotalColories).reversed()).limit(3)
				.map(e -> e.getTotalColories()).reduce(0, Integer::sum);
	}
}
