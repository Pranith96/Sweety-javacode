import java.util.ArrayList;
import java.util.List;

public class ListExample {

	// java.util package
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); //List<Integer> list = new LinkedList<>(); // Set<Integer> set = new HashSet<>();LinkedHasSet<>, TreeSet<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("..............................");

		for(Integer i: list) {
			System.out.println(i);
		}
		
		System.out.println("..............................");
		System.out.println(list.get(2));
		System.out.println("..............................");
		list.remove(0);
		System.out.println(list);
		System.out.println("..............................");
		System.out.println(list.size());

	}
}
