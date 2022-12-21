package oops;
		//parent class
		class Bank
		{
			public void loaninterest()
			{
				System.out.println("9% interest");
			}
			}
		//Sbi is subclass which inherit parent class Bank
		class Sbi extends Bank
		{
			public void sbiloan()
			{
				System.out.println("For SBI");
			}
			}
		//Hdfc is subclass which inherit parent class Bank
		class Hdfc extends Bank
		{
			public void hdfcloan() {
				System.out.println("for HDFC");
			}
			}
		////Axis is subclass which inherit parent class Bank
		class Axis extends Bank{
			public void axisloan()
			{
				System.out.println("For AXIS");
			}
		}
		public class HirarchicalDemo {

			public static void main(String[] args) {
				Axis ax=new Axis();
				ax.axisloan();
				ax.loaninterest();
				Hdfc hdfc=new Hdfc();
				hdfc.hdfcloan();
				hdfc.loaninterest();
				Sbi sb=new Sbi();
				sb.sbiloan();
				sb.loaninterest();

			}

		}
		 


