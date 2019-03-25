package chapter02;

import java.util.Arrays;
import java.util.List;

/**
 * @author : ddv
 * @since : 2019/3/25 下午12:00
 */

public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("tom", "jack", "ddv");
		list.stream().map(String::toUpperCase).forEach(System.out::println);

	}
}
