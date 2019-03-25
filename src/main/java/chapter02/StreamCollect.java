package chapter02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 剖析Stream内部collect方法的定义
 * 利用Supplier接口重复获取新的流
 *
 * @author : ddv
 * @since : 2019/3/22 下午5:56
 */

public class StreamCollect {

	public static void main(String[] args) {
		Supplier<Stream<String>> supplier = () -> Stream.of("tom", "cat", "jack", "ddv");

		List<String> collect = supplier.get().collect(Collectors.toList());

		List<String> collect01 = supplier.get().collect(() -> new ArrayList<String>(), (strings, s) -> {
			strings.add(s);
		}, (strings, strings2) -> strings.addAll(strings2));

		List<String> collect02 = supplier.get().collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

		collect.forEach(System.out::print);
		System.out.println();
		collect01.forEach(System.out::print);
		System.out.println();
		collect02.forEach(System.out::println);
	}
}
