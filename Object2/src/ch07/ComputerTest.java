package ch07;

public class ComputerTest {
	public static void main(String[] args) {
		Computer desktop = new Desktop();
		Computer myNoteBook = new MyNoteBook();
		
		desktop.turnOn();
		myNoteBook.turnOn();
		
		desktop.display();
		myNoteBook.display();
		
		desktop.typing();
		myNoteBook.typing();
		
		desktop.turnOut();
		myNoteBook.turnOut();
		
		
	}
}
