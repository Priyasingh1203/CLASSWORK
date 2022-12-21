package oops;
		class Animal//grand parent
		{
			public void diplay()
			{
				System.out.println("Animal");
			}
			
			}
		class Dog extends Animal//parent
		{
			public void dog()
			{
				System.out.println("Dog is barking...");
			}
			}
		class Puppy extends Dog//child
		{
			public void puppy()
			{
				System.out.println("Child of Dog");
			}
			}
		public class MultilevelInheritanceDemo {

			public static void main(String[] args) {
				Puppy puppy=new Puppy();
				puppy.diplay();
				puppy.dog();
				puppy.puppy();
			}

		
	}
	