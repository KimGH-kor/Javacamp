package ch03;

import ch01.MyArray;
//���� ����
public class MyArrayStack {
	
	//ch01�� ����� ���°�
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
			System.out.println("������ ���� ã���ϴ�.");
			return;
		}
		//������ �ֱ�
		arrayStack.addElement(date);
		top++;	
	}
	//�ϳ��� ��������
	public int pop() {
		if(isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�.");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	//�ִ°� Ȯ��
	public int peek() {
		if(isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�.");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	//�迭�̴ϱ� ��á���� Ȯ���ؾ��Ѵ�.
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
