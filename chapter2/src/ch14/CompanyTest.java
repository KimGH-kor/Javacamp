package ch14;

public class CompanyTest {
	public static void main(String[] args) {
		//�ҷ����� ��
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);//ch14.Company@5ca881b5
		System.out.println(company2);//ch14.Company@5ca881b5
		//���� ���� ���´�.
		
	}
}
