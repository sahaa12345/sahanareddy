package multilevelinheritanceex;

public class Main {

	public static void main(String[] args) {
		Puppy p=new Puppy("chobby","beow beow","white");
		System.out.println(p.name);
		p.talk();
		System.out.println(p.beh);
		p.shout();
		System.out.println(p.colour);
		p.walk();
		
	}

}
