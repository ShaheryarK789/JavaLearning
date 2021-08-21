package SimpleJavaMultithreading;

// Extend classes from 'Thread' whose methods need to run in multithreading OR implements Runnable interface
// those methods of those class should be named as 'run' 
//	Call the methods of those classes as 'start' like classobject.start

// 1- Extend Thread 2-start  3-run

public class A {

	public static void main(String[] args) throws InterruptedException {

		B  ObjB = new B();
		C  ObjC = new C();
	
		ObjB.start();
		ObjC.start();
	

//	ObjB.M_B();
//	ObjC.M_C();
	
		
	}

}
