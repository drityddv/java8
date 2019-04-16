package chapter02;

import bean.Student;

/**
 * @author : ddv
 * @since : 2019/3/25 下午12:00
 */

public class Main {
	public static void main(String[] args) {
		Student student = mock(1);
		System.out.println(student.equals(null));
	}

	private static Student mock(int i) {
		if (i == 1) {
			return null;
		}

		return new Student("tom", 20);
	}
}
