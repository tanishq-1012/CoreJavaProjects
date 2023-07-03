class MyThread5 extends Thread{
	public void run() {
		System.out.println("The priority of child thread :: "+Thread.currentThread().getPriority());
		
		for(int i = 0; i<5; i++) {
			System.out.println("Child thread");
		}
	}
}
public class launch5 {

	public static void main(String[] args) {
		MyThread5 t5 = new MyThread5();
		t5.setPriority(10);
		t5.start();
		
		System.out.println("The priority of main thread :: "+Thread.currentThread().getPriority());
		for(int i = 0; i<5; i++) {
			System.out.println("Main thread");
		}

	}

}
