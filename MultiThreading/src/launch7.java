class MyRunnable2 implements Runnable{
	@Override
	public void run(){
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Tanishq");
			
		}
		
	}
}
public class launch7 {

	public static void main(String[] args) throws InterruptedException{
		MyRunnable2 r = new MyRunnable2();
		Thread t = new Thread(r);
		
		t.start();
		t.join();
		for(int i=0; i<5; i++) {
			System.out.println("Sharma");
		}

	}

}
