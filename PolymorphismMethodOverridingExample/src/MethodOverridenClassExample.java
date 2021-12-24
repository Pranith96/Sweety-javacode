
public class MethodOverridenClassExample extends MethodOverridingExample {

	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public void hello(String message) {
		welcome();
		System.out.println("Welcome " + message);
	}

	public long add(int a, int b, long c) {
		long d = a - (-b) - (-c);
		return d;
	}

	public static void message() {
		System.out.println("Hi Welcome:");
	}
	
	private void welcome() {
		System.out.println("print ");
	}
}
