package collection;

import java.util.ArrayList;

public class UserArrayList {

	public static void main(String[] args) {
		ArrayList<Student1> student1=new ArrayList<>();
		/*
		 * Student1 s1= new Student1(101,"Priya","MCA"); 
		 * Student1 s2= new Student1(102,"Miss","MCA"); 
		 * Student1 s3= new Student1(103,"Singh","BCA");
		 * student1.add(s1); student1.add(s2); student1.add(s3);
		 */
		//using anonymous object
		student1.add(new Student1(101,"Miss","MCA"));
		student1.add(new Student1(102,"Priya","MCA"));
		student1.add(new Student1(103,"Singh","BCA"));
		for(Student1 std:student1)
		{
			System.out.println("Id: "+std.getId());
			System.out.println("Name: "+std.getName());
			System.out.println("Course: "+std.getCourse());
			System.out.println("============================================================");
		}
	}

}
