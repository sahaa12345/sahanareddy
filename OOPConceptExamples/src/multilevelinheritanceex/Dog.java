package multilevelinheritanceex;

public class Dog extends Animal{
	String beh;

	public Dog(String name, String beh) {
		super(name);
		this.beh = beh;
	}
	public void shout() {
		System.out.println("shouting.......");
	}

}
