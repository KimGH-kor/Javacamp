package ch05;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMeterial(powder);
		
		Powder p = (Powder)printer.getMeterial();
		System.out.println(p);
	}
}
