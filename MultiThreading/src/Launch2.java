//Overloading run()
class MyThread2 extends Thread{
	public void run() {
		System.out.println("No args method");
	}
	public void run(int i) {
		System.out.println("agr method");
	}
}
public class Launch2 {

	public static void main(String[] args) {
		MyThread2 t2 = new MyThread2();
		t2.start();
		
	

	}

}
