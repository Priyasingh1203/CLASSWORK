package inheritance;
class Parent{
	public void parentclassMethod()
	{
		System.out.println("I m a parent class");
	}
}
class Child extends Parent{
	public void childclassMethod()
	{
		System.out.println("I m a class class");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Child ch= new Child();
		ch.parentclassMethod();
		ch.childclassMethod();
	}

}
