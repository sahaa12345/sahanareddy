package methodoverridingex;

public class Main {

	public static void main(String[] args) {
		Vehicle v=new Vehicle("abc","pink");
		v.move();
		System.out.println(v.toString());

	}

}
