package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> p = x->x%2==0;
		System.out.println(p.test(10));
		Predicate<String> p1 =Str->Str.charAt(0)==('A');
		System.out.println(p1.test("anuu"));
	}

}
