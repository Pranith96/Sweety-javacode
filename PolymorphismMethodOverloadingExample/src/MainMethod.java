
public class MainMethod {

	public static void main(String[] args) {
		MethodOverLoadingExample example = new MethodOverLoadingExample();
		int result1 = example.add(2, 2);
		System.out.println(result1);
		System.out.println(example.add(2, 2));
		int result2 = example.add(5, 5, 5);
		System.out.println(result2);
		long result3 = example.add(123456789l, 10000000, 1000000l);
		System.out.println(result3);
	}
}
