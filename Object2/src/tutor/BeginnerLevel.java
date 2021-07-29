package tutor;

public class BeginnerLevel extends PlayerLevel {

	@Override
	void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	void jump() {
		System.out.println("점프는 불가능합니다.");
	}

	@Override
	void turn() {
		System.out.println("턴은 불가능 합니다.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("****초보자입니다.****");
	}
}
