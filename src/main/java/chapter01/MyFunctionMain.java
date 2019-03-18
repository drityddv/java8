package chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 自定义Function接口,接受两个泛型参数,返回一个R类型结果
 *
 * @author : ddv
 * @since : 2019/3/15 下午7:53
 */

public class MyFunctionMain {

	public static void main(String[] args) {
		List<Apple> appleList;
		appleList = makeApplesByParams(Arrays.asList(1, 2, 5), Arrays.asList("peer", "apple", "bigApple"), Apple::new);
		appleList.forEach(System.out::println);
	}

	private static <A, B, R> List<R> makeApplesByParams(List<A> paramList1, List<B> paramList2, MyFunction<A, B, R> function) {
		List<R> results = new ArrayList<>(paramList1.size());
		A a;
		B b;
		for (int i = 0; i < paramList1.size(); i++) {
			a = paramList1.get(i);
			b = paramList2.get(i);
			results.add(function.accept(a, b));
		}

		return results;
	}
}

@FunctionalInterface
interface MyFunction<A, B, R> {

	/**
	 * Applies this function to the given argument.
	 *
	 * @param a the function argument
	 * @param b the function argument
	 * @return the function result
	 */
	R accept(A a, B b);

}
