package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(plasticPrinter);
		
		//이런것도 가능
		GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder1 = (Powder)powderPrinter2.getMaterial();
		System.out.println(powderPrinter);
		
		
		//이제는 extends로 타입 받아오는 것을 지정하였기 때문에 다른 타입을 가져올 수 없다.
		//GenericPrinter<Water> printer = new GenericPrinter<Water>();	
		
	}
}

