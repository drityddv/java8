package main;

import main.service.PvpService;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : ddv
 * @since : 2019/3/14 下午3:02
 */

public class Main {
	private static PvpService pvpService = PvpService.getInstance();
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		while (true) {

		}
	}

	private static void handler(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			log(list.get(i));
		}
	}

	private static void log(Integer integer) {
		System.out.println(integer);
	}


}
