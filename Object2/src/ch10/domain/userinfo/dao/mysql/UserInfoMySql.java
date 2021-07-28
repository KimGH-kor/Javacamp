package ch10.domain.userinfo.dao.mysql;

import ch10.domain.userinfo.UserInfo;
import ch10.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySql implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID = "+ userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into MySQL DB userID = "+ userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into MySQL DB userID = "+ userInfo.getUserId());
	}
	
}
