package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author : ddv
 * @since : 2019/3/14 下午3:02
 */

public class Main {
	private static HashMap<String, User> vipUsers = new HashMap<>();
	private static List<User> users = new ArrayList<>();

	static {
		vipUsers.put("ddv", new User("ddv", 20));
		vipUsers.put("tom", new User("tom", 10));
		vipUsers.put("jack", new User("jack", 30));

		users.add(new User("ddv", 20));
		users.add(new User("tom", 10));
		users.add(new User("jack", 30));
	}

	public static void main(String[] args) {
		vipUsers.forEach((s, user) -> System.out.println(user));
	}


	/**
	 * @param user
	 */
	private static void log(User user) {
		System.out.println(user);
	}


	static abstract class BaseUser {
		private int vipLevel;
		private String name;

		public int getVipLevel() {
			return vipLevel;
		}

		public void setVipLevel(int vipLevel) {
			this.vipLevel = vipLevel;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean canLoadVipMap(Set<String> set) {
			return set.contains(this.name);
		}

		public User copy() {
			try {
				User user = (User) this.clone();
				return user;
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public String toString() {
			return "BaseUser{" +
					"vipLevel=" + vipLevel +
					", name='" + name + '\'' +
					'}';
		}
	}

	static class User extends BaseUser implements Cloneable {

		private int age;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public User() {
		}

		public User(String name, int age) {
			this.age = age;
			super.name = name;
		}

		private void handler(User user) {
			System.out.println(user);
		}

		@Override
		public boolean canLoadVipMap(Set<String> set) {
			return false;
		}
	}
}