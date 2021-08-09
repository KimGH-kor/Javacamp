package ch05;

public class GenericPrinterTest {
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(null);
		
		Powder p = powderPrinter.getMaterial();
		
	}
}
