package ch09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	public MemberHashSet(int size) {
		hashSet = new HashSet<Member>(size);
	}
	
	public void addMember(Member member) {
		hashSet.add(member);//���ʸ� ���� �������� ������Ʈ Ÿ������ ���� ���߿� ����ȯ
	}
	
	public boolean removeMember(int memberID) {

		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if( tempId == memberID) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID +"�� �������� �ʽ��ϴ�.");
		return false;
		
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
