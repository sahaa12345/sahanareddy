package multilevelinheritance;

public class UserLogic {

	public static void main(String[] args) {
		System.out.println("puppy object is used to access all members");
		Puppy p=new Puppy("leo","beow beow","white");
		System.out.println(p.name);
		System.out.println(p.beh);
		System.out.println(p.colour);
		p.shout();
		p.eat();
		p.walk();
		
		System.out.println();
		
		System.out.println("Dog object is used to access only Object,Animal,Dog members only");
		Dog d=new Dog("abc","beowww");
		System.out.println(d.name);
		System.out.println(d.beh);
		//System.out.println(d.colour);
		d.shout();
		d.eat();
		//d.walk();
		
		System.out.println();
		
		System.out.println("Animal object is used to access only Object and Animal members");
		Animal a=new Animal("Cat");
		System.out.println(a.name);
		//System.out.println(a.beh);
		//System.out.println(a.colour);
		a.shout();
		//a.eat();
		//a.walk();
		

	}

}
