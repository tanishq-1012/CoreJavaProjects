class MyThread6 extends Thread{
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
public class Launch6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread6 t6 = new MyThread6();
		
		t6.start();
		
		t6.join(1000);
		
		for(int i = 0; i<5; i++) {
			System.out.println("Rama Thread");
		}
		
	}

}
