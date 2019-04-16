package chapter03;

import bean.Student;

import java.util.Arrays;
import java.util.List;

/**
 * @author : ddv
 * @since : 2019/4/1 下午6:11
 */

public class Main {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("tom", 50)
				, new Student("jack", 60)
				, new Student("fury", 100)
				, new Student("hub", 80));

		long count = studentList.stream().filter(student -> student.getScore() > 60).count();
		System.out.println(count);
		count = studentList.stream().filter(student -> student.getScore() > 60).count();
		System.out.println(count);

		StringBuilder sb = new StringBuilder();
		sb.append("");
	}
}
