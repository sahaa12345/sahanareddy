package nonprimitivetypecasting;

public class Main {

	public static void main(String[] args) {
		//auto-upcasting
		System.out.println("auto-upcasting");
		Mobile m=new Oppo(128,"realme","gold");//up casting
		System.out.println(m.bN);
		System.out.println(m.RAM);
		//System.out.println(m.colour);
		m.calling();
		m.chatting();
		//m.searching();
		System.out.println();
		
		System.out.println("explicit down casting");
		//Oppo p=(Oppo)new Mobile(256,"vivo");//direct down casting is not possible.->ClassCastException
		Mobile m1=new Oppo(256,"vivo","black");//up casting
		Oppo o=(Oppo)m1;//explicit down casting
		System.out.println(o.bN);
		System.out.println(o.RAM);
		System.out.println(o.colour);
		o.calling();
		o.chatting();
		o.searching();
		
		
		
		
	}

}
