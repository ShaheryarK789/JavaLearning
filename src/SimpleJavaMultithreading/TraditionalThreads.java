/*
Traditional threads or Platform Threads:
Threads allows a program to operate more efficiently by doing multiple things at the same time.
Threads can be used to perform complicated tasks in the background without interrupting the main program. 

Extend classes from 'Thread' whose methods need to run in multithreading OR implements Runnable interface
those methods of those class should be named as 'run' 
Call the methods of those classes as 'start' like classobject.start  

    1- Extend Thread ..............2-start .................. 3-run
*/
 class TraditionalThreads {

	public static void main(String[] args) throws InterruptedException {

		B  ObjB = new B();
		B ObjB1 = new B();
		
	
		ObjB.start();
		ObjB1.start();
// Both threads will run in parallel
	}
}
 class B  extends Thread 
{
	 public  void run ()
	 {
		 for (int  i=0; i<=10; i++)
		 {
			 
			 System.out.println("Method--->B: "+ i); 
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
	 }
	}

 
