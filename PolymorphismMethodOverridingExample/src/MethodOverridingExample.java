
public class MethodOverridingExample {

	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public void hello(String message) {
		welcome();
		System.out.println("Hi " + message);
	}

	public long add(int a, int b, long c) {
		long d = a + b + c;
		return d;
	}

	//TO DO
	public static void message() {
		System.out.println("Hello");
	}
	
	private void welcome() {
		System.out.println("Hi ");
	}
	
}
