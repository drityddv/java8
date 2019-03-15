package chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Function<T,R>接口
 * R apply(T t);
 *
 * @author : ddv
 * @since : 2019/3/14 下午12:05
 */

public class FunctionMain {

	public static void main(String[] args) {
		List<Integer> ids = Arrays.asList(1, 2, 3);
		makeApples(ids, (Integer id) -> new Apple(id)).forEach(System.out::println);
	}

	private static <I, R> List<R> makeApples(List<I> ids, Function<I, R> function) {
		List<R> apples = new ArrayList<>(ids.size());

		for (I i : ids) {
			apples.add(function.apply(i));
		}

		return apples;
	}
}

class Apple {
	private int id;

	Apple(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Apple{" +
				"id=" + id +
				'}';
	}
}
