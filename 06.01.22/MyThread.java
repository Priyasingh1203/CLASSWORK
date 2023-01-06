package thread; 

public class MyThread implements Runnable{                                             //interface Class Runnable is implemented by class MyThread
	public void run() {                                                                  //method run of MyThread class
		System.out.println(Thread.currentThread().getName()+"Threading is done");          //pre-defined method currentThread and getName
		
	}

	public static void main(String[] args) {             
		MyThread mt = new MyThread();                                                      //creating object mt for MyThread class
		Thread t1=new Thread(mt, "My Thread");                                             //creating object t1 for Thread class and callimg mt object of MyThread
		t1.start();                                                                        //calling pre-defined method of Thread class
		
	}	

}
