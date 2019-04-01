package main;

/**
 * @author : ddv
 * @since : 2019/3/26 上午10:44
 */

public enum Skill {

	/**
	 * 风
	 */
	WIND("wind") {
		@Override
		public Skill[] getSkills() {
			return new Skill[]{WIND, ICE};
		}
	},

	/**
	 * 冰
	 */
	ICE("ice");

	/**
	 * 技能名
	 */
	private String name;

	Skill(String name) {
		this.name = name;
	}

	public Skill[] getSkills() {
		return new Skill[]{this};
	}
}
