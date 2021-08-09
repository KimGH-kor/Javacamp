package tutor;

public class Subject {
	
	String name;
	int tensu;
	
	public Subject(String name, int tensu) {
		this.name = name;
		this.tensu = tensu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTensu() {
		return tensu;
	}

	public void setTensu(int tensu) {
		this.tensu = tensu;
	}
	
	public int showTensu() {
		return tensu;
	}
	public String showName() {
		return name;
	}
	
}
