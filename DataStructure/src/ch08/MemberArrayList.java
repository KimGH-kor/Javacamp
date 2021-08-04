package ch08;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	public MemberArrayList(int size) {
		arrayList = new ArrayList<Member>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);//���ʸ� ���� �������� ������Ʈ Ÿ������ ���� ���߿� ����ȯ
	}
	
	public boolean removeMember(int memberID) {
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//	
//			int tempId = member.getMemberId();
//			if( tempId == memberID) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
//		System.out.println(memberID +"�� �������� �ʽ��ϴ�.");
//		return false;
		Iterator<Member> ir = arrayList.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if( tempId == memberID) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberID +"�� �������� �ʽ��ϴ�.");
		return false;
		
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
