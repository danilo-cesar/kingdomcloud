package edu.dlut.kingdomcloud.factory;

import edu.dlut.kingdomcloud.entity.AccountEntity;

public class EntitiesFactory {
	public static AccountEntity productAccountEntity()throws Exception{
		return new AccountEntity();
	}
}
