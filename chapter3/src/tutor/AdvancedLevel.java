package tutor;

public class AdvancedLevel extends PlayerLevel{

	@Override
	void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	void jump() {
		System.out.println("높이 점프합니다.");
	}

	@Override
	void turn() {
		System.out.println("턴은 불가능 합니다.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("****중급자입니다.****");
	}

}
