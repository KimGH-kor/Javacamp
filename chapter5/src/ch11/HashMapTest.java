package ch11;

import java.util.HashMap;

public class HashMapTest {

		public static void main(String[] args) {
			
			MemberHashMap hashMap = new MemberHashMap();
			
			Member memberLee = new Member(1001, "이순신");
			Member memberKim = new Member(1002, "김유신");
			Member memberKang = new Member(1003, "강감찬");
			Member memberHong = new Member(1004, "홍길동");
			
			hashMap.addMember(memberHong);
			hashMap.addMember(memberLee);
			hashMap.addMember(memberKim);
			hashMap.addMember(memberKang);
			
			hashMap.showAllMember();
			
			//원래 HashMap 하는법
			HashMap<Integer, String> hash = new HashMap<>();
			hash.put(1001, "Kim");
			hash.put(1002, "Lee");
			hash.put(1003, "Park");
			hash.put(1004, "Hong");
			
			System.out.println(hash);
		}
	}

