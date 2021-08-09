package ch10;


import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);//���ʸ� ���� �������� ������Ʈ Ÿ������ ���� ���߿� ����ȯ
	}
	
	public boolean removeMember(int memberID) {

		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if( tempId == memberID) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID +"�� �������� �ʽ��ϴ�.");
		return false;
		
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
