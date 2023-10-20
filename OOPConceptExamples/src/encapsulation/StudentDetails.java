package encapsulation;

public class StudentDetails {

	public static void main(String[] args) {
		Student s=new Student("vikky",51,23);
		/*System.out.println("Student name is: "+s.getName());
		System.out.println("Student id is: "+s.getId());
		System.out.println("Student age is: "+s.getAge());*/
		s.setName("anu");
		s.setId(12);
		s.setAge(17);
		System.out.println("Student name is: "+s.getName());
		System.out.println("Student id is: "+s.getId());
		System.out.println("Student age is: "+s.getAge());

	}

}
