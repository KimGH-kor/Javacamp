package ch03;

import ch01.MyArray;
//스택 구현
public class MyArrayStack {
	
	//ch01때 만들거 쓰는거
	MyArray arrayStack;
	int top;
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int date) {
		if(isFull()) {
			System.out.println("스택이 가득 찾습니다.");
			return;
		}
		//데이터 넣기
		arrayStack.addElement(date);
		top++;	
	}
	//하나씩 꺼내오기
	public int pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	//있는거 확인
	public int peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	//배열이니깐 꽉찼는지 확인해야한다.
	public boolean isFull() {
		if( top == arrayStack.ARRAY_SIZE) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		
		if(top == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
	
}
