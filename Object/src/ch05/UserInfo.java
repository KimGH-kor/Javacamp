package ch05;

public class UserInfo {
	public String userId;
	public String userName;
	
	public UserInfo() {
		
	}
	
	public UserInfo(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public void showUserInfo() {
		System.out.println("userId : "+userId);
		System.out.println("userName : "+userName);
	}
}
