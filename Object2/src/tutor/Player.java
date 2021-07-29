package tutor;

public class Player {
	PlayerLevel level = new BeginnerLevel();;
	
	public void getLevel() {
		System.out.println(level);
	}
	
	public void play(int count) {
		level.showLevelMessage();
		level.run();
		for(int i = 0; i < count; i++) {
		level.jump();
		}
		level.turn();
		System.out.println("==========================");
	}
	
	void upgradeLevel(PlayerLevel level){
		this.level = level;
	}

	
}
