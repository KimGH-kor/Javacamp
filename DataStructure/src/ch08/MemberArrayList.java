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
		arrayList.add(member);//제너릭 선언 안했으면 오브젝트 타입으로 들어가서 나중에 형변환
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
//		System.out.println(memberID +"가 존재하지 않습니다.");
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
		System.out.println(memberID +"가 존재하지 않습니다.");
		return false;
		
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
