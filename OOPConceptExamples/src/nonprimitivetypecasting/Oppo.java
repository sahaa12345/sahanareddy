package nonprimitivetypecasting;
//child or sub class

public class Oppo extends Mobile{
	String colour;

	public Oppo(int rAM, String bN, String colour) {
		super(rAM, bN);
		this.colour = colour;
	}
	public void searching() {
		System.out.println("searching......");
	}
	

}
