package hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationTest {

	public static void main(String[] args) {
		List<String> al = new CopyOnWriteArrayList<>();

		al.add("pinky");
		al.add("devi");
		al.add("gf");
		al.add("no");

		for (String s : al) {

			System.out.println(s);
			al.add("indu");
		}
		System.out.println("------------------");
		Set<String> hs = new HashSet<>();
		hs.addAll(al);
		for (String s : al) {

			System.out.println(s);

		}
		System.out.println("------------------");
		for (String s : hs) {

			System.out.println(s);

		}
		System.out.println("------------------");
		Iterator<String>itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
