package ch05;

public class UserInfoTest {
	public static void main(String[] args) {
		UserInfo Lee = new UserInfo();
		Lee.userId = "51234";
		Lee.userName = "Lee";
		
		Lee.showUserInfo();
		
		UserInfo Kim = new UserInfo("16523", "Kim");
		Kim.showUserInfo();
	}
}
