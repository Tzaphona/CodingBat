
public class makeAbba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeAbba("hi", "bye"));
	}
	public static String makeAbba(String a, String b) {
		String abba = a.concat(b.concat(b)).concat(a);
		  return abba;
	}
}
