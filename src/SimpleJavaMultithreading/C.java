package SimpleJavaMultithreading;

public class C  extends Thread
{
	
	 public  void run ()
	 {
	 
		 for (int  i=0; i<=10; i++)
		 {
			
			 System.out.println("Method--->C");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 
	 }
}
