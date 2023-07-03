class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Child thread");
		}
	}
}
public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i =0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}

}
