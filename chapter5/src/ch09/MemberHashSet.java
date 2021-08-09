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
		hashSet.add(member);//제너릭 선언 안했으면 오브젝트 타입으로 들어가서 나중에 형변환
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
		System.out.println(memberID +"가 존재하지 않습니다.");
		return false;
		
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
