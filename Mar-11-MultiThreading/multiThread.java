class MultiTestThread extends Thread{
	//To implement multithreading by extending Thread
	
	public void run(){
		System.out.println("MultiTestThread is running");
	}

	public static void main(String[] args) {
		MultiTestThread t1 = new MultiTestThread();
		t1.start();
		/* Throws Exception!
			t1.start();
		*/
	}
}

class MultiTestRunnable implements Runnable{
	//To  implement multithreading by implementing Runnable
	
	public void run(){
		System.out.println("MultiTestRunnable is running");
	}

	public static void main(String[] args) {
		MultiTestRunnable mt1 = new MultiTestRunnable();
		Thread t2 = new Thread(mt1);
		t2.start();
	}	
}

class MultiTestSleep extends Thread{
	//To run 2 threads where run() contains a Thread.sleep(*);
	
	public void run(){
		for (int i = 0; i < 5; ++i){
			try { Thread.sleep(400); }
			catch (InterruptedException e) { System.out.println(e); }
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MultiTestSleep t1 = new MultiTestSleep();
		MultiTestSleep t2 = new MultiTestSleep();

		System.out.println("Run t1.start() & t2.start()");

		t1.start();
		t2.start();
	}
}

class MultiTestRunTwoThreads extends Thread{
	//To run 2 threads whose .run() is executed instead of .start();
	
	public void run(){
		for (int i = 0; i < 5; ++i){
			try { Thread.sleep(400); }
			catch (InterruptedException e) { System.out.println(e); }
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MultiTestRunTwoThreads t1 = new MultiTestRunTwoThreads();
		MultiTestRunTwoThreads t2 = new MultiTestRunTwoThreads();

		System.out.println("Run t1.run() & t2.run()");
		
		t1.run();
		t2.run();
	}
}

class MultiTestJoin extends Thread{
	//To run 3 threads where thread1 is given priority by .join();
	
	public void run(){
		for (int i = 0; i < 5; ++i){
			try { Thread.sleep(400); }
			catch (InterruptedException e) { System.out.println(e); }
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MultiTestJoin t1 = new MultiTestJoin();
		MultiTestJoin t2 = new MultiTestJoin();
		MultiTestJoin t3 = new MultiTestJoin();

		t1.start();

		try { t1.join(); }
		catch (Exception e) { System.out.println(e); }

		t2.start();
		t3.start();

		/* To see if Sop("Hello") is printed before/after t2,t3 .start()
			try { t2.join(); }
			catch (Exception e) { System.out.println(e); }
			try { t3.join(); }
			catch (Exception e) { System.out.println(e); }
		*/

		System.out.println("Hello");
	}
}

class MultiTestisAlive extends Thread{
	//To implement isAlive()

	public void run(){
		Thread currentT = Thread.currentThread();

		for (int i = 0; i < 5; ++i){
			try { Thread.sleep(400); }
			catch (InterruptedException e) { System.out.println(e); }

			System.out.print(i);
			System.out.print("\tThis Thread isAlive?:\t" + currentT.isAlive() + "\n");
		}
	}

	public static void main(String[] args) {
		MultiTestisAlive t1 = new MultiTestisAlive();

		t1.start();
		
		try { t1.join(); }
		catch (Exception e) { System.out.println(e); }

		System.out.println("This Thread isAlive?:\t" + t1.isAlive());
	}
}

class MultiTestName extends Thread{
	//To name threads

	public void run(){
		System.out.println("Current Thread:\t" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MultiTestName t1 = new MultiTestName();
		MultiTestName t2 = new MultiTestName();

		t1.setName("ThisBeThread0");
		t2.setName("ThisBeThread1");

		t1.start();
		t2.start();
	}
}

class MultiTestPriority extends Thread{
	//To assign priority to threads
	/* Note:
		In most cases, threads execute according to their priority. However, it is up to the JVM.
	*/


	public void run(){
		Thread currentT = Thread.currentThread();
		System.out.println("Current Thread:\t" + currentT.getName() + "\tPriority:\t" + currentT.getPriority());
	}

	public static void main(String[] args) {
		MultiTestPriority t1 = new MultiTestPriority();
		MultiTestPriority t2 = new MultiTestPriority();	
		MultiTestPriority t3 = new MultiTestPriority();	

		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setName("Thread#1");

		t2.setPriority(Thread.MAX_PRIORITY);
		t2.setName("Thread#2");

		t3.setPriority(3);
		t3.setName("Thread#3");

		t1.start();
		t2.start();
		t3.start();
	}
}

class MultiTestGeneralThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName() + " is in control!");
	}

	public static void main(String[] args) {
		MultiTestGeneralThread t1 = new MultiTestGeneralThread();

		t1.start();

		Thread.yield();

		System.out.println(Thread.currentThread().getName() + " is in control.");
	}
}