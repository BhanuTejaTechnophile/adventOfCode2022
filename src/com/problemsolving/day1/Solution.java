package com.problemsolving.day1;

import java.util.ArrayList;
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
}
