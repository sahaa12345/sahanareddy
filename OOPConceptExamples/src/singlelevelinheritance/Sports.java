package singlelevelinheritance;
//parent or super or base class

public class Sports {  
	String outdoor;

	public Sports(String outdoor) {
		super();
		this.outdoor = outdoor;
	}
	public void player() {
		System.out.println("playing......");
	}
	@Override
	public String toString() {
		return "outdoor: "+this.outdoor+" ";
	}

}
