import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
	//String country() default "India";
	//int runs () default 20000;
	String Country();
	int runs();
}

@CricketPlayer(Country = "India", runs = 20000)
class ViratKholi {
	private int innings;
	private String name;
	
	public int getInnings() {
		return innings;
	}
	
	public void setInnings(int innings) {
		this.innings = innings;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
public class LaunchAnnno1 {

	public static void main(String[] args) {
		ViratKholi vk = new ViratKholi();
		vk.setName("Virat Kholi");
		vk.setInnings(20000);
		System.out.println(vk.getName());
		System.out.println(vk.getInnings());

	}

}
