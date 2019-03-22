package main.service;

/**
 * 技能枚举
 *
 * @author : ddv
 * @since : 2019/3/20 下午4:16
 */
public enum Skill {
	/**
	 * 火系技能
	 */
	FIRE("火", 99) {
		@Override
		public int getDamage(Skill skill) {
			return FIRE.damage;
		}
	},

	/**
	 * 冰系技能
	 */
	ICE("冰", 80) {
		@Override
		public int getDamage(Skill skill) {
			return ICE.damage;
		}
	},

	/**
	 * 风系技能
	 */
	WIND("风", 100) {
		@Override
		public int getDamage(Skill skill) {
			return WIND.damage;
		}
	},;

	private String name;
	private int damage;

	Skill(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	public abstract int getDamage(Skill skill);
}
