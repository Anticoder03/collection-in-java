package collectionDemo;

public class Student {
	protected int r_no,age;
	protected String name;
	public int getR_no() {
		return r_no;
	}
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Student() {}
	
	public Student(int r_no, int age, String name) {
		super();
		this.r_no = r_no;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [r_no=" + r_no + ", age=" + age + ", name=" + name + "]";
	}
	
	
		
	
}
