package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(plasticPrinter);
		
		//�̷��͵� ����
		GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder1 = (Powder)powderPrinter2.getMaterial();
		System.out.println(powderPrinter);
		
		
		//������ extends�� Ÿ�� �޾ƿ��� ���� �����Ͽ��� ������ �ٸ� Ÿ���� ������ �� ����.
		//GenericPrinter<Water> printer = new GenericPrinter<Water>();	
		
	}
}

