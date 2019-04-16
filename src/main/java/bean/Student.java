package bean;

/**
 * @author : ddv
 * @since : 2019/4/1 下午6:10
 */

public class Student {
	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public boolean equals(Object o) {
		if (name == null || o == null || getClass() != o.getClass()) {
			return false;
		}

		Student student = (Student) o;
		return name.equals(student.getName());
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", score=" + score +
				'}';
	}
}
