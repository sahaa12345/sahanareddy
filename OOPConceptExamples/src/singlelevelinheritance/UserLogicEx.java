package singlelevelinheritance;

public class UserLogicEx {

	public static void main(String[] args) {
		Makeup m=new Makeup("lakmi");
		System.out.println(m.bN);
		m.beautiful();
		System.out.println(m.toString());
		System.out.println(m.hashCode());
		
		
		
		
		EyeLiner e=new EyeLiner("mack","gold");
		System.out.println(e.bN);
		e.beautiful();
		System.out.println(e.colour);
		e.eyeLining();
		System.out.println(e.hashCode());
		System.out.println(e.equals(m));
		System.out.println();
		System.out.println(e.toString());

	}

}
