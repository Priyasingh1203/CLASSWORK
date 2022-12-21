package oops;

class Student
{
	int roll;
	String name;
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		}
	void display()
	{
		System.out.println("Roll: "+ " "+roll+ " "+ "name: " +name);
	}
	}

public class ParameterizeConstructor {

	public static void main(String[] args) {
		Student priya=new Student(111,"Priya");
		priya.display();
		Student singh=new Student(112,"Singh");
		singh.display();
		
	}

}
