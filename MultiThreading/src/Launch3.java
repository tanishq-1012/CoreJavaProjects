//Overriding start()

class MyThread3 extends Thread{
	@Override
	public void start() {
		System.out.println("Start method overriding");
	}
	
	@Override
	public void run() {
		System.out.println("run method");
	}
}
public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 t3 = new MyThread3();
		
		t3.start();
		t3.run();
	}

}
