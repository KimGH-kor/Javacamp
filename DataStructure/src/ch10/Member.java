package ch10;

import java.util.Comparator;

public class Member implements Comparator<Member>{

	private int memberId;        //ȸ�� ���̵�
	private String memberName;   //ȸ�� �̸�

	public Member() {};
	
	public Member(int memberId, String memberName){ //������
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString(){   //toString �޼ҵ� �����ε�
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�";
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}

//	@Override
//	public int compareTo(Member member) {//�ݹ� �Լ���� ��
//		
//		if(this.memberId > member.memberId) {//���� ����
//			return 1;
//		}else if(this.memberId < member.memberId) {//������ ����
//			return -1;
//		}else {
//			return 0;
//		}
//	}
//	@Override
//	public int compareTo(Member member) {//�ݹ� �Լ���� ��
//		return this.memberId - member.memberId;
//	}

	@Override
	public int compare(Member member1, Member member2) {
		return member1.memberId - member2.memberId;
	}
}
