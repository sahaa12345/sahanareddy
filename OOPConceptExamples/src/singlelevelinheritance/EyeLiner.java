package singlelevelinheritance;

public class EyeLiner extends Makeup{
	String colour;
	

	public EyeLiner(String bN, String colour) {
		super(bN);
		this.colour = colour;
	}


	public static void eyeLining() {
		System.out.println("eyelining.........");
	}
	
	public String toString() {
		return "colour: "+this.colour+ " bN: "+this.bN+" ";
	}
	

}
