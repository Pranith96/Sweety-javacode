
public class MainMethod {

	public static void main(String[] args) {

		Addition addition = new Addition();
		addition.add(5, 5);
		int sumResult = addition.sum(2, 3, 4);
		System.out.println(sumResult);
		addition.hello();
		String message = addition.hi();
		System.out.println(message);
		String displayOutput = addition.display("Hello Hi");
		System.out.println(displayOutput);
		String output = addition.code(10);
		System.out.println(output);
		long sumResult1 = addition.sum(1,3, 4);
		System.out.println(sumResult1);
	}
}
