package object1;

public class student {

	String name;
	int age;
	char gender;
	long mobno;
	String loc;
	
	public student() {

	}

	public student(String name, int age, char gender, long mobno, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobno = mobno;
		this.loc = loc;
	}
	public void dispalyStudent()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		System.out.println("Mob.No :"+mobno);
		System.out.println("Location :"+loc);
		System.out.println(".................................");

	}

}
