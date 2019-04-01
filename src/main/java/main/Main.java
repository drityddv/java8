package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : ddv
 * @since : 2019/3/26 上午10:51
 */

public class Main {

	private static Map<String, String> map = new HashMap<>(16);

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello", "hi", "hey");
		List<String> list2 = Arrays.asList("ddv", "tom", "jack");

		list.stream().flatMap(hi -> list2.stream().map(name -> hi + " " + name))
				.collect(Collectors.toList()).forEach(System.out::println);

	}
}
