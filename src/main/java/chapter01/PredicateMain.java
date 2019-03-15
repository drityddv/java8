package chapter01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate<T>接口
 * test()方法返回boolean
 *
 * @author : ddv
 * @since : 2019/3/14 上午11:33
 */

public class PredicateMain {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		filterLogger(list, (Integer i) -> (i & 1) == 1);
	}

	private static <T> void filterLogger(List<T> list, Predicate<T> predicate) {
		for (T t : list) {
			if (predicate.test(t)) {
				System.out.println(t);
			}
		}
	}
}
