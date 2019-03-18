package chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : ddv
 * @since : 2019/3/15 下午8:23
 */

public class ComparatorMain {

	public static void main(String[] args) {
		List<Person> personList = makePersonList(Arrays.asList("tom", "jack", "mike", "mimo"),
				Arrays.asList(20, 14, 71, 20), Arrays.asList(70, 85, 62, 60), Person::new);

		personList.forEach(System.out::println);
		System.out.println();

		personList.sort(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getWeight));

		personList.forEach(System.out::println);

	}

	private static <A, B, C, R> List<R> makePersonList(List<A> paramsList1, List<B> paramsList2, List<C> paramsList3, PersonFunction<A, B, C, R> function) {
		ArrayList<R> result = new ArrayList<>();

		for (int i = 0; i < paramsList1.size(); i++) {
			result.add((R) function.accept(paramsList1.get(i), paramsList2.get(i), paramsList3.get(i)));
		}

		return result;
	}
}

class Person {
	private String name;
	private int age;
	private int weight;

	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", weight=" + weight +
				'}';
	}
}

@FunctionalInterface
interface PersonFunction<A, B, C, R> {

	/**
	 * Applies this function to the given argument.
	 *
	 * @param a the function argument
	 * @param b the function argument
	 * @param c the function argument
	 * @return the function result
	 */
	R accept(A a, B b, C c);

}

