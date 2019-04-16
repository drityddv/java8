package jodatime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * @author : ddv
 * @since : 2019/4/8 下午2:43
 */

public class Main {

	public static void main(String[] args) {
		DateTime dateTime = new DateTime();
		DateTime days = dateTime.plusDays(1);
		DateTime minusDays = dateTime.minusDays(2);
		System.out.println("------------初始日期");
		System.out.println(dateTime.toString("yyyy-mm-dd"));
		System.out.println("------------加1天");
		System.out.println(days.toString("yyyy-mm-dd"));
		System.out.println("------------减2天");
		System.out.println(minusDays.toString("yyyy-mm-dd"));

		System.out.println("------------localDate");
		LocalDate localDate = new LocalDate();
		System.out.println(localDate);

		System.out.println("------------localDate1 月份天数最小的和最大的");
		LocalDate localDate1 = localDate.plusMonths(1).plusYears(1).dayOfMonth().withMinimumValue();
		LocalDate localDate2 = localDate.plusMonths(1).plusYears(1).dayOfMonth().withMaximumValue();
		System.out.println(localDate1);
		System.out.println(localDate2);

		System.out.println("------------ 计算两年前第三个月最后一天的日期");
		LocalDate localDate3 = localDate.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMaximumValue();
		System.out.println(localDate3);
	}
}
