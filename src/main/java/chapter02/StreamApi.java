package chapter02;

import main.User;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * iterate()生成流对象需要做限制
 * flatMap()
 * Optional对象的操作 (规避空指针)
 *
 * @author : ddv
 * @since : 2019/3/27 上午10:11
 */

public class StreamApi {
	private static List<User> resource = Arrays.asList(new User(), new User(), new User());

	public static void main(String[] args) {

//		List<User> list = getList();
		List<User> list = resource;
		list.forEach(System.out::println);
		for (int i = 0; i < list.size(); i++) {
			User user = list.get(i);
		}
		list.forEach(user -> user = null);


		resource.forEach(System.out::println);
	}

	private static List<User> getList() {
		return resource;
	}

	private static void iterate() {
		Stream<Integer> stream = Stream.iterate(1, integer -> integer + 2).limit(6);
		int sum = stream.filter(integer -> integer > 2).mapToInt(value -> value * 2).skip(2).limit(2).min().getAsInt();
		System.out.println(sum);
	}

	private static void optional() {
		Stream<Integer> stream = Stream.generate(() -> UUID.randomUUID().hashCode());
		stream.findFirst().ifPresent(System.out::println);
	}

	private static void flatMap() {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(12, 0, 3);
		List<Integer> list3 = Arrays.asList(19, 6, 4);
		Stream<List<Integer>> stream = Stream.of(list1, list2, list3);
		stream.flatMap(list ->
				list.stream().map(o ->
						o * o
				)
		).forEach(System.out::println);
	}
}
