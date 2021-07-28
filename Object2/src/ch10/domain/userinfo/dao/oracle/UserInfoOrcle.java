package ch10.domain.userinfo.dao.oracle;

import ch10.domain.userinfo.UserInfo;
import ch10.domain.userinfo.dao.UserInfoDao;

public class UserInfoOrcle implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Orcle DB userID = "+ userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Orcle DB userID = "+ userInfo.getUserId());		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Orcle DB userID = "+ userInfo.getUserId());		
	}

}
