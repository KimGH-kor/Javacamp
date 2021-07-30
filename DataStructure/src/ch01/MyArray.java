package ch01;

public class MyArray {
	int[] intArr;   	//int array
	int count;  		//개수
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray(){
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size){
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num){
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
				
	}
//마지막 요소부터 포지션 위치까지 하나씩 뒤로 밀고 빈 곳에 값을 추가
	public void insertElement(int position, int num){
		int i; //인덱스
		if(position < 0 || position > count) {
			System.out.println("적절한 위치가 아닙니다.");
			return;
		}
		
		if(count >= ARRAY_SIZE) {
			System.out.println("배열의 크기를 벗어났습니다.");
			return;
		}
		  // 하나씩 이동
		for(i = count-1; i >= position; i--) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] = num;
		count++;
	}
	
	public int removeElement(int position){
		int ret = ERROR_NUM;
		
		if( isEmpty()) {
			System.out.println("배열이 비어있습니다.");
			return ret;
		}
		
		if(position < 0 || position > count-1) {
			return ret;
		}
		
		ret = intArr[position];
		for(int i = position; i < count-1; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}

}
