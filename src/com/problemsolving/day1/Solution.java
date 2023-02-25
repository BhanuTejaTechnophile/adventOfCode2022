package com.problemsolving.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Solution {
	public String Test() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		StringJoiner input = new StringJoiner(",");
		String line = br.readLine();
		while (!line.equals("exit")) {
			if (!line.isEmpty()) {
				input.add(line);
			} else {
				input.add(" ");
			}
			line = br.readLine();
		}
		return input.toString();
	}
}
