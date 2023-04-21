package FunctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceExample {

	public static void main(String[] args) {
		Function<Integer,Integer> f1 = x -> x*x*x;
		Function<Integer,Integer> f2 = x -> 2*x;
		Function<Integer,Integer> f3 = x -> {
			int fact=1;
			for(int i=2;i<=x;i++)
				fact= fact*i;
			return fact;
};

		System.out.println(f3.apply(3));
		System.out.println(f1.apply(5));
		System.out.println(f2.apply(6));
	}

}
