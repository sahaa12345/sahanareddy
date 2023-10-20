package encapsulation;

public class Details {

	public static void main(String[] args) {
		StudentEx s=new StudentEx("null",21,-15);
		System.out.println("Student name is: "+s.getName());
		System.out.println("Student id is: "+s.getId());
		System.out.println("Student age is: "+s.getAge());
		
		System.out.println("reintialized student details......");
		
		s.setName(null);
		s.setId(12);
		s.setAge(-13);
		System.out.println("Student name is: "+s.getName());
		System.out.println("Student id is: "+s.getId());
		System.out.println("Student age is: "+s.getAge());
		
	}

}
