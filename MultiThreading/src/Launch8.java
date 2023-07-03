//Interupting thread

class Mythread22 extends Thread{
	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println("I am a sleeping thread :: "+i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e){
			System.out.println("I got interrupted");
		}
	}
}
public class Launch8 {

	public static void main(String[] args) throws InterruptedException {
		Mythread22 t = new Mythread22();
		t.start();
		
		t.interrupt();
		
		System.out.println("End of main...");

	}

}
