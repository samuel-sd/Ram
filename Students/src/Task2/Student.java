package Task2;

public class Student {

	long id;
	String Name;
	String grade;
	int age;

	public Student(long id, String Name, String grade, int age) {
		
		this.id = id;
		this.Name = Name;
		this.grade = grade;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", grade=" + grade + ", age=" + age + "]";
	}
	

}
