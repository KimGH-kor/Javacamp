package tutor;

public class SuperLevel extends PlayerLevel {

	@Override
	void run() {
		System.out.println("��û ������ �޸��ϴ�.");
	}

	@Override
	void jump() {
		System.out.println("���� ���� �����մϴ�.");
	}

	@Override
	void turn() {
		System.out.println("�� �մϴ�.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("****������Դϴ�.****");
	}
}
