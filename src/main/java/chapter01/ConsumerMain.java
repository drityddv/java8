package chapter01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer<T>接口
 * accept()返回void
 *
 * @author : ddv
 * @since : 2019/3/14 上午11:43
 */

public class ConsumerMain {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d", null);
		try {
			loggerList(list, (String s) -> System.out.println(s.length()));
		} catch (Exception e) {
			throw new RuntimeException("null point");
		}


	}

	private static <T> void loggerList(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}
}
