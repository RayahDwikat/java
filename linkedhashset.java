import java.util.*;
public class linkedHashSet {

	public static void main(String[] args) {
		Set<Integer> integerLinkedHashSet = new LinkedHashSet<>();
		
		integerLinkedHashSet.add(4);
		integerLinkedHashSet.add(1);
		integerLinkedHashSet.add(3);
		integerLinkedHashSet.add(-2);
		
		System.out.println(integerLinkedHashSet); // they will be printed in the same order as they entered
		System.out.println(integerLinkedHashSet.size());
		integerLinkedHashSet.remove(3);
		System.out.println(integerLinkedHashSet); 
		System.out.println(integerLinkedHashSet.size());
		
		Set<Integer> anotherIntegerLinkedHashSet = new LinkedHashSet<>();
		anotherIntegerLinkedHashSet.add(40);
		anotherIntegerLinkedHashSet.add(10);
		anotherIntegerLinkedHashSet.add(3);
		
		System.out.println(anotherIntegerLinkedHashSet.contains(10)); // searching for element
		anotherIntegerLinkedHashSet.addAll(integerLinkedHashSet);
		System.out.println(anotherIntegerLinkedHashSet);
		System.out.println(anotherIntegerLinkedHashSet.size());
		anotherIntegerLinkedHashSet.retainAll(integerLinkedHashSet);
		System.out.println(anotherIntegerLinkedHashSet);

	}

}

