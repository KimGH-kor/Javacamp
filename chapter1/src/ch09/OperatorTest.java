package ch09;

public class OperatorTest {
	public static void main(String[] args) {
		
		int gameScore = 150;
		int gameScore2 = 150;
		
		int lastScore = ++gameScore;
		int lastScore2 = gameScore2++;
		
		
		System.out.println(lastScore);//151
		System.out.println(gameScore);//151
		
		System.out.println(lastScore2);//150
		System.out.println(gameScore2);//151
	}
}
