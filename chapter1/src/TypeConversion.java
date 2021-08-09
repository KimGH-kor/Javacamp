
public class TypeConversion {

	public static void main(String[] args) {
		byte bNum = 125;
		int iNum = bNum;  //큰갑으로 넣는 것은 형변환이 필요없다.
		
		System.out.println(iNum);//125
		
		int iNum1 = 20;
		float fNum = (float)iNum1;//정수보다는 실수가 더 크다고 생각하면 된다.

		System.out.println(fNum);//20.0
		
		int iNum2 = 10;
		byte bNum2 = (byte)iNum2;//작은 타입으로 변경하는 것은 형 변환 시켜줘야한다.

		System.out.println(bNum2);//10
		
		double dNum = 3.14;
		int iNum3 = (int)dNum;//실수 타입을 정수 타입으로 형 변환을 시키면 소수점은 짤린 상태를 받아온다.
		
		System.out.println(iNum3);//3
		
		
		
		double dNum1 = 1.2;//더블과 플롯 타입은 소수점까지 나타내지만 이걸 강제적으로 int타입으로 변환 시키면
		float fNum1 = 0.9F;//정수값만 표시된다.
		
		int iNum4 = (int)dNum1 + (int)fNum1;//1+0 = 1
		int iNum5 = (int)(dNum1 + fNum1);//(1.2+0.9)하고나서 형변환 2
		
		System.out.println(iNum4);//1
		System.out.println(iNum5);//2
	}
}


