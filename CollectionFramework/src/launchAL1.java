//ArrayList Demonstration

import java.util.ArrayList;
public class launchAL1 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		System.out.println(al1);
		
		System.out.println("******************");
		
		ArrayList al2 = new ArrayList();
		al2.add("Tanishq");
		al2.add(10);
		al2.add(19.4);
		al2.add('D');
		System.out.println(al2);
		
		System.out.println("****************");
		
		ArrayList al3 = new ArrayList();
		al3.addAll(al2);
		System.out.println(al3);
		
		System.out.println("*****************");
		
		ArrayList al4 = new ArrayList();
		al4.add(10);
		al4.add(22);
		al4.add(33);
		
		System.out.println("The existing arraylist "+ al4);
		al4.add(2,28);
		System.out.println("After adding at index 2 "+ al4);
		
		al4.add(0,90);
		System.out.println("After adding at index 0 "+ al4);
		
		al4.add(80);
		System.out.println("After adding at rear end "+al4);
		
		
	}

}
