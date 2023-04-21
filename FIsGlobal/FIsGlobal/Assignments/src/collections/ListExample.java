package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(60);
		l.add(70);
		System.out.println(l);
		
		List<Integer> l1= new LinkedList<>();
		l1.add(35);
		l1.add(45);
		l1.add(18);
		l.addAll(l1);
		System.out.println(l);
		l1.addAll(3, l);
		System.out.println(l1);
		l.add(5, null);
		System.out.println(l);
		System.out.println(l.contains(l1));
		System.out.println(l1.contains(l));
		System.out.println(l.containsAll(l1));
		System.out.println(l1.containsAll(l));
		l.remove(5);
		System.out.println(l1.containsAll(l));
		System.out.println(l.equals(l1));
		System.out.println(l.get(07));
		System.out.println(l.size());
		System.out.println(l1.size());
		System.out.println("Displaying list1");
		l.forEach(System.out::println);
		System.out.println("Displaying list2");
		l1.forEach(System.out::println);
		System.out.println(l.lastIndexOf(l1));
		l.clear();
		l.get(0);
		l.getClass();
		l.hashCode();
		l.indexOf(l1);
		l.isEmpty();
		l.iterator();
		l.lastIndexOf(l1);
		l.listIterator();
		l.listIterator(0);
		
}
}