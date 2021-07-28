package ch13;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		//ArrayList = 어레이리스트 값 반환한 후 삭제 remove;
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
