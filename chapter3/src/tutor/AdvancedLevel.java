package tutor;

public class AdvancedLevel extends PlayerLevel{

	@Override
	void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	void jump() {
		System.out.println("���� �����մϴ�.");
	}

	@Override
	void turn() {
		System.out.println("���� �Ұ��� �մϴ�.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("****�߱����Դϴ�.****");
	}

}
