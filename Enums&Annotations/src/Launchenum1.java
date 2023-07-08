enum Result{
	PASS, FAIL, NR;
	
	Result(){
		System.out.println("Constructor is called");
	}
}
public class Launchenum1 {

	public static void main(String[] args) {
		Result res = Result.PASS;
		System.out.println(res);
		
		Result resArr[] = Result.FAIL.values();
		
		for(Result i : resArr) {
			System.out.println(i.ordinal()+" : "+i.name());
		}
	}

}
