package chapter02;

import java.util.stream.IntStream;

/**
 * @author : ddv
 * @since : 2019/3/22 下午5:56
 */

public class Main {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 20).forEach(System.out::println);
	}
}
