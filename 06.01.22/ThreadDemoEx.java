package thread;                                                                    

public class ThreadDemoEx extends Thread {                                                                       //ThreadDemoEx inherits class Thread
    public void run()                                                                                            //concrete method 
    {
    	for(int i=1;i<=5;i++)
    	{
    		try {                                                                                                    //use of try method for interrupted exception
    			Thread.sleep(400);                                                                                     //sleep predefined method
    		}catch(InterruptedException e)
    		{
    			System.out.println(e.getMessage());                                                                    //getMessage predefined method
    		}
    		System.out.println(Thread.currentThread().getName());
    	}
    }
	public static void main(String[] args) {
		ThreadDemoEx t1=new ThreadDemoEx();                                                                          //creating objects 
		ThreadDemoEx t2=new ThreadDemoEx();
		ThreadDemoEx t3=new ThreadDemoEx();
		ThreadDemoEx t4=new ThreadDemoEx();
		t1.setName("Thread-1");                                                                                      //setName for printing the output
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		t1.start();                                                                                                  //calling start pre- defined method 
		t2.start();
		t3.start();
		t4.start();
		
		
	}
	
}
