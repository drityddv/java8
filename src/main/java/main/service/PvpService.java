package main.service;

/**
 * @author : ddv
 * @since : 2019/3/18 下午5:32
 */

public class PvpService {

	private static PvpService instance = new PvpService();

	private PvpService(){}

	public static PvpService getInstance() {
		return instance;
	}


}
