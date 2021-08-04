package ch09;

import java.util.HashSet;
public class HashSetTest {

		public static void main(String[] args) {

			MemberHashSet hashSet = new MemberHashSet();
			Member memberLee = new Member(1001, "이순신");
			Member memberKim = new Member(1002, "김유신");
			Member memberKang = new Member(1003, "강감찬");

			hashSet.addMember(memberLee);
			hashSet.addMember(memberKim);
			hashSet.addMember(memberKang);
			
			Member memberHong = new Member(1003, "홍길동");
			hashSet.addMember(memberHong);
			
			hashSet.showAllMember();//해쉬셋은 들어온 순서대로 출력하지는 않는다.
									//또한 id가 중복인 값은 넣지않는다.
		}
	}

