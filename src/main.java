import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.problemsolving.day1.Solution;

public class main {
	public static void main(String[] args) throws IOException {
		Solution solution = new Solution();
		String input = solution.Test();
		List<String> items = Arrays.asList(input.split(","));
		items.stream().forEach(System.out::println);
	}

}
