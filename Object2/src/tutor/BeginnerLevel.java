package tutor;

public class BeginnerLevel extends PlayerLevel {

	@Override
	void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	void jump() {
		System.out.println("������ �Ұ����մϴ�.");
	}

	@Override
	void turn() {
		System.out.println("���� �Ұ��� �մϴ�.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("****�ʺ����Դϴ�.****");
	}
}
