package basicprogram;
class std
{
	int id;
	String name;
	static String college = "SVU";
	std(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
	   System.out.println("Id: " +id+ "\n" + "Name:" +name+ "\n" + "College:" + college);   
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        std s1= new std(101,"Priya");
        std s2= new std(102,"Singh");
        s1.display();
        System.out.println("===============");
        s2.display();
        
        
	}

}
