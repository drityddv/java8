import java.util.Arrays;
import java.util.List;

/**
 * @author : ddv
 * @since : 2019/3/14 下午3:02
 */

public class Main {
	public static void main(String[] args) {
		handler(Arrays.asList(1, 2, 3, 4, 5));
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
