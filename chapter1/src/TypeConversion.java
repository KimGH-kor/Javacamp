
public class TypeConversion {

	public static void main(String[] args) {
		byte bNum = 125;
		int iNum = bNum;  //ū������ �ִ� ���� ����ȯ�� �ʿ����.
		
		System.out.println(iNum);//125
		
		int iNum1 = 20;
		float fNum = (float)iNum1;//�������ٴ� �Ǽ��� �� ũ�ٰ� �����ϸ� �ȴ�.

		System.out.println(fNum);//20.0
		
		int iNum2 = 10;
		byte bNum2 = (byte)iNum2;//���� Ÿ������ �����ϴ� ���� �� ��ȯ ��������Ѵ�.

		System.out.println(bNum2);//10
		
		double dNum = 3.14;
		int iNum3 = (int)dNum;//�Ǽ� Ÿ���� ���� Ÿ������ �� ��ȯ�� ��Ű�� �Ҽ����� ©�� ���¸� �޾ƿ´�.
		
		System.out.println(iNum3);//3
		
		
		
		double dNum1 = 1.2;//����� �÷� Ÿ���� �Ҽ������� ��Ÿ������ �̰� ���������� intŸ������ ��ȯ ��Ű��
		float fNum1 = 0.9F;//�������� ǥ�õȴ�.
		
		int iNum4 = (int)dNum1 + (int)fNum1;//1+0 = 1
		int iNum5 = (int)(dNum1 + fNum1);//(1.2+0.9)�ϰ��� ����ȯ 2
		
		System.out.println(iNum4);//1
		System.out.println(iNum5);//2
	}
}


