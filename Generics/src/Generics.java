//We can make our own class as generic class

class Gen<T>{
	T obj;
	
	Gen(T obj){
		this.obj = obj;
	}
	public void show() {
		System.out.println("The type of object is:" + obj.getClass().getName());
		
	}
	
	public T getObject() {
		return obj;
	}
}
public class Generics {

	public static void main(String[] args) {
		Gen<Integer> g1 = new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObject());
		
		System.out.println();
		
		Gen<String> g2 = new Gen<String>("Tanishq");
		g2.show();
		System.out.println(g2.getObject());
		
		System.out.println();
		
		Gen<Character> g3 = new Gen<Character>('T');
		g3.show();
		System.out.println(g3.getObject());
		
		System.out.println();
		
		Gen<Double> g4 = new Gen<Double>(10.4);
		g4.show();
		System.out.println(g4.getObject());
		
		System.out.println();
		
		
		

	}

}
