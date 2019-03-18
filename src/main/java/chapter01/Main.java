package chapter01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 函数式接口
 *
 * @author : ddv
 * @since : 2019/3/11 下午8:30
 */

public class Main {
	String port = "900";

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.submit(() -> System.out.println(Thread.currentThread().getName()));

	}


}
