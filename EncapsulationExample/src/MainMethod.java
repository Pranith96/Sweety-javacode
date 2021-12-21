
public class MainMethod {

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setPlotNo(19);
		address.setName("werty");
		address.setCity("HYD");
		
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("ABCDE");
		student.setMobileNumber("1234567890");
		student.setAddress(address);
		
		Address address1 = new Address();
		address1.setPlotNo(20);
		address1.setName("Qwerty");
		address1.setCity("HYD1");
		
		Student student1 = new Student();
		student1.setStudentId(2);
		student1.setStudentName("ABCD");
		student1.setMobileNumber("123456789");
		student1.setAddress(address1);
		
		System.out.println(student);
		System.out.println(student1);

		String name = student.getStudentName();
		System.out.println(name);
	}
}
