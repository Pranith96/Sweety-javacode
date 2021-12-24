
public class MethodOverLoadingExample {

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public int add(int a, int b, int c) {
		int d = a * b * c;
		return d;
	}

	public long add(long a, int b, long c) {
		long d = a + b + c;
		return d;
	}

}
