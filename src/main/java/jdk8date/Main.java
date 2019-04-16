package jdk8date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.MonthDay;

/**
 * @author : ddv
 * @since : 2019/4/8 下午3:34
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------指定参数生成日期");
		LocalDate date = LocalDate.of(2018, 2, 10);
		System.out.println(date);

		System.out.println("-----------------生成年月格式日期");
		MonthDay monthDay = MonthDay.from(date);
		System.out.println(monthDay);

		Clock clock = Clock.systemDefaultZone();
		System.out.println(clock);
	}
}
