package ch09;
public class MakeReport {
	//스트링 클래스를 쭉이어서 적을때는 스트링버퍼나 스트링빌더를 사용
	//메모리가 오버되기 때문
	StringBuffer buffer = new StringBuffer();
	
	private String line = "===========================================\n";
	private String title = "  이름\t   주소 \t\t  전화번호  \n";
	private void makeHeader()
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	//원래는 배열로 만드는것이 더 좋음
	private void generateBody()
	{
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	
	private void makeFooter()
	{
		
		buffer.append(line);
	}
	//클라이언트에는 이것만 제공해준다 이것빼고는 다 private
	public String getReport()
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
