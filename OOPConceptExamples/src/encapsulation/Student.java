package encapsulation;

public class Student {
	private String name;
	private int id;
	private int age;
	
	public Student(String name, int id, int age) {
		super();
		if(name!=null&&id>=0&&(age>=0&&age<=100)) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
		else {
			System.out.println("check student details....");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null) {
		this.name = name;
	}
		else {
			System.out.println("enter correct name.");
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>=0) {
		this.id = id;
	}
		else {
			System.out.println("enter correct id.");
		}
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0&&age<=100) {
		this.age = age;
	}
		else {
			System.out.println("enter correct age.");
		}
	}
	

}
