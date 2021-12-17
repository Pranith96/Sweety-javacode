
public class Addition {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public int sum(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

	public long sum(long a, long b, long c) {
		long d = a + b + c;
		return d;
	}

	public void hello() {
		System.out.println("hello");
	}

	public String hi() {
		return "Hello Welcome";
	}

	public String display(String message) {
		String greeting = "Hello " + message;
		return greeting;
	}

	public String code(int number) {
		String message = number + " Hello";
		return message;
	}
}
