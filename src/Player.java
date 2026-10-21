
public class Player {
	private String name;
	private int level;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getLevel () {
		return level;
	}
	
	public void setLevel(int level) {
		if(level>=1&&level<=99) {
			this.level=level;
		}
	}
}
