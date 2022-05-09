
public class Person {
	String name;
	private int horror;
	private int action;
	private int comedy;
	private int fantasy;
	private int sciFi;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getHorror() {
		return horror;
	}
	public int getAction() {
		return action;
	}
	public int getComedy() {
		return comedy;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHorror(int horor) {
		this.horror = horor;
	}
	public void setAction(int action) {
		this.action = action;
	}
	public void setComedy(int comedy) {
		this.comedy = comedy;
	}
	public int getFantasy() {
		return fantasy;
	}
	public void setFantasy(int fantasy) {
		this.fantasy = fantasy;
	}
	public int getSciFi() {
		return sciFi;
	}
	public void setSciFi(int sciFi) {
		this.sciFi = sciFi;
	}
	
}
