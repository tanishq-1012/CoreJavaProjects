enum Course{
	JAVA, JEE, SPRINGBOOT;
	int courseId;
	
	Course(){
		System.out.println("Constructor");
	}
	
	void secourseId(int courseId) {
		this.courseId = courseId;
	}
	
	int getCourseId() {
		return courseId;
	}
}
public class LaunchEnum2 {

	public static void main(String[] args) {
		
		Course.JAVA.secourseId(10);
		
		int Cid = Course.JAVA.getCourseId();
		System.out.println(Cid);
	}

}
