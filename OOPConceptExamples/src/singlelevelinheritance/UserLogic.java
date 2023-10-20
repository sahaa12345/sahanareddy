package singlelevelinheritance;

public class UserLogic {

	public static void main(String[] args) {
		System.out.println("Using Sports object we access Object,Sports class members only.");
		Sports s=new Sports("football");
		System.out.println(s.outdoor);
		s.player();
		System.out.println(s.toString());
		//s.batting();
		
		System.out.println();
		
		System.out.println("Using Cricket object we access Object,Sports,Cricket class members(all members)");
		Cricket c=new Cricket("hockey");
		System.out.println(c.toString());
		System.out.println(c.outdoor);
		c.player();
		c.batting();
		
		

	}

}
