package nonprimitivetypecasting;
//parent or super class

public class Mobile {
	int RAM;
	String bN;

	
	public Mobile(int rAM, String bN) {
		super();
		RAM = rAM;
		this.bN = bN;
	}
	public void calling() {
		System.out.println("calling.....");
	}
	public static void chatting() {
		System.out.println("chatting.....");
	}

}
