
public class MainMethod {

	public static void main(String[] args) {
		MethodOverridenClassExample methodOverridenClassExample = new MethodOverridenClassExample();
		System.out.println(methodOverridenClassExample.add(2, 2, 2));
		methodOverridenClassExample.hello("ABCDE");
		System.out.println(methodOverridenClassExample.mul(5, 4));
		//methodOverridenClassExample.welcome();
		MethodOverridenClassExample.message(); // static method should be called directly by class name, no need to create object
		MethodOverridingExample.message();

		MethodOverridingExample example = new MethodOverridenClassExample(); //runtime polymorphism
		System.out.println(example.add(2, 2, 2));
		example.hello("QWERTY");
		System.out.println(example.mul(5, 4));
		//example.welcome();
		MethodOverridingExample.message();
	}
}


//javac Hello.java // compiletime ==> .java ==> .class file (byte code)
//java Hello // runtime ==> code executes