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
		
		
		//파일을 읽어들이는 클래스
		FileInputStream fis = new FileInputStream("db.properties");
		
		
		//파일 안에 있는 키값과 벨류값을 쌍으로 읽어들여 리턴을 해줌 수 있는 클래스
		Properties prop = new Properties();
		
		prop.load(fis);
		
		                //키값을 적으면 벨류값을 리턴
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
