import java.util.*;
public class hashSet {

	public static void main(String[] args) {
		Set<Integer> integerHashSet = new HashSet<>();
		
		integerHashSet.add(4);
		integerHashSet.add(1);
		integerHashSet.add(3);
		integerHashSet.add(-2);
		
		System.out.println(integerHashSet); // they will be printed in random order.
		System.out.println(integerHashSet.size());
		integerHashSet.remove(3);
		System.out.println(integerHashSet); // they will be printed in random order.
		System.out.println(integerHashSet.size());
		
		Set<Integer> anotherIntegerHashSet = new HashSet<>();
		anotherIntegerHashSet.add(40);
		anotherIntegerHashSet.add(10);
		anotherIntegerHashSet.add(3);
		
		System.out.println(anotherIntegerHashSet.contains(10)); // searching for element
		anotherIntegerHashSet.addAll(integerHashSet);
		System.out.println(anotherIntegerHashSet);
		System.out.println(anotherIntegerHashSet.size());
		anotherIntegerHashSet.retainAll(integerHashSet);
		System.out.println(anotherIntegerHashSet);

	}

}

