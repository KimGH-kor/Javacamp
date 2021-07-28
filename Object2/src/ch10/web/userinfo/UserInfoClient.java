package ch10.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch10.domain.userinfo.UserInfo;
import ch10.domain.userinfo.dao.UserInfoDao;
import ch10.domain.userinfo.dao.mysql.UserInfoMySql;
import ch10.domain.userinfo.dao.oracle.UserInfoOrcle;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		
		
		//������ �о���̴� Ŭ����
		FileInputStream fis = new FileInputStream("db.properties");
		
		
		//���� �ȿ� �ִ� Ű���� �������� ������ �о�鿩 ������ ���� �� �ִ� Ŭ����
		Properties prop = new Properties();
		
		prop.load(fis);
		
		                //Ű���� ������ �������� ����
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("Lee");
		
		
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOrcle();
		}else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySql();
		}else {
			System.out.println("db error");
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
}
