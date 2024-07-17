package pkg1;

public class Test {
	public static void main(String[] args) {
		boolean result = new Utils().isNumeric("234");
		System.out.println(result);
		
		new LoginManager().save("Raj Rai", "", "", "rajrai", "rajrai@123", "user");
	}
}
