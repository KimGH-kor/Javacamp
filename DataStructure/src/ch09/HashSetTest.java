package ch09;

import java.util.HashSet;
public class HashSetTest {

		public static void main(String[] args) {

			MemberHashSet hashSet = new MemberHashSet();
			Member memberLee = new Member(1001, "�̼���");
			Member memberKim = new Member(1002, "������");
			Member memberKang = new Member(1003, "������");

			hashSet.addMember(memberLee);
			hashSet.addMember(memberKim);
			hashSet.addMember(memberKang);
			
			Member memberHong = new Member(1003, "ȫ�浿");
			hashSet.addMember(memberHong);
			
			hashSet.showAllMember();//�ؽ����� ���� ������� ��������� �ʴ´�.
									//���� id�� �ߺ��� ���� �����ʴ´�.
		}
	}

