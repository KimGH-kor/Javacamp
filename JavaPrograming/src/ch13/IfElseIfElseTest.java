package ch13;

public class IfElseIfElseTest {
	public static void main(String[] args) {
		int age = 12;
		int charge = 0;//�۷ι� ������ ������ ���� ����
					  //���� Ǯ�� 0�� �������� ��� �ɶ��� �־��µ� �� ������
		              //�� ���� ���� ��� ���� ���� �� �־�� �ϱ� �����̾���.
		              //if���� else�� ���ٸ� �� �� ���� ��
		
		//if�ȿ� ������ �����ϰ� ���� �־ ��Ͼȿ� �־ ���� �ʱ�ȭ �ȴ�.
		if(age < 8){
			charge = 1000; 
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}else if(age < 14){//12���̱⶧���� �ʵ��л� �Դϴ�.
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}else if(age < 20){
			charge = 2500;
			System.out.println("��, ����л� �Դϴ�.");
		}else{
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�.");
		} 
		
		System.out.println("������ " + charge + "���Դϴ�.");//������ 2000���Դϴ�. ���

	}
}
