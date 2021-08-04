package ch10;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2)*-1;
	}
	
}



public class TreeSetTest {

		public static void main(String[] args) {
			
//			MemberTreeSet treeSet = new MemberTreeSet();
//			
//			Member memberLee = new Member(1001, "�̼���");
//			Member memberKim = new Member(1002, "������");
//			Member memberKang = new Member(1003, "������");
//			Member memberHong = new Member(1004, "ȫ�浿");
//			
//			treeSet.addMember(memberHong);
//			treeSet.addMember(memberLee);
//			treeSet.addMember(memberKim);
//			treeSet.addMember(memberKang);
//			
//			treeSet.showAllMember();
			
			TreeSet<String> set = new TreeSet<String>(new MyCompare());
			set.add("Park");
			set.add("Kim");
			set.add("Lee");
			
			System.out.println(set);
		}
	}

