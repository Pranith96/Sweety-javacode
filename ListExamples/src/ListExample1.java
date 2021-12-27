import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStudentId(1);
		student.setMobileNumber("12345678");
		student.setStudentName("ABCDE");

		Student student1 = new Student();
		student1.setStudentId(2);
		student1.setMobileNumber("123456789");
		student1.setStudentName("ABCDEF");

		Student student2 = new Student();
		student2.setStudentId(3);
		student2.setMobileNumber("123456780");
		student2.setStudentName("ABCDEFG");

		List<Student> list = new ArrayList<>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		list.add(new Student(4, "QWERTY", "34564567"));
		list.add(new Student(5, "QWERTY345", "567567"));

		System.out.println(list);
		System.out.println("..............................");

		for (Student st : list) {
			System.out.println(st);
		}
		System.out.println("..............................");

		System.out.println(list.get(0));
	}

}
