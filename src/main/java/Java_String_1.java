
public class Java_String_1 {
	
	
	static String messege;
	static String hello = "Hello ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(helloName("Bob"));
	}

	public static String helloName(String name) {
		
		messege = (hello.concat(name).concat("!"));
		return (messege);
	}

}
