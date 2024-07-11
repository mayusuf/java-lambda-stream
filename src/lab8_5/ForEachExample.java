package lab8_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");

		ForEachExample fe = new ForEachExample();

		System.out.println("To Upper Case Using Lambda : " + fe.uppercaseMethodReference(list));
		System.out.println("To Upper Case Using Method Reference : " + fe.uppercaseLambda(list));
	}

	public List<String> uppercaseLambda(List<String> list) {

		return list.stream()
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
	}

	public List<String> uppercaseMethodReference(List<String> list) {

		return list.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
	}
	
	
}