package methodoverridingex;

public class Vehicle extends AutoMobile{
	String colour;
	
	public Vehicle(String name, String colour) {
		super(name);
		this.colour = colour;
	}
	public void move() {
		System.out.println("Vehicles.....");
	}
	@Override
	public String toString() {
		return "name is: "+this.name+" "+"colour is: "+this.colour+" ";
		
	}

}
