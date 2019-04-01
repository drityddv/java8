package main;

/**
 * @author : ddv
 * @since : 2019/3/27 下午10:24
 */

public class User {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				'}';
	}
}
