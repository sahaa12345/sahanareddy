package multilevelinheritanceex;

public class Puppy extends Dog{
	String colour;

	public Puppy(String name, String beh, String colour) {
		super(name, beh);
		this.colour = colour;
	}
	public static void walk() {
		System.out.println("walking.......");
	}

}
