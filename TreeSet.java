import java.util.*;
public class treeSet {

	public static void main(String[] args) {
		TreeSet<Integer> integerTreeSet = new TreeSet<>();
		
		integerTreeSet.add(4);
		integerTreeSet.add(1);
		integerTreeSet.add(3);
		integerTreeSet.add(-2);
		// they will be printed sorted, because they when they entered they are sorted
		System.out.println(integerTreeSet); 
		System.out.println(integerTreeSet.size());
		integerTreeSet.remove(3);
		System.out.println(integerTreeSet); 
		System.out.println(integerTreeSet.size());
		
		
		TreeSet<Integer> anotherIntegerTreeSet = new TreeSet<>();
		anotherIntegerTreeSet.add(40);
		anotherIntegerTreeSet.add(10);
		anotherIntegerTreeSet.add(3);
		
		System.out.println(anotherIntegerTreeSet.contains(10)); // searching for element
		anotherIntegerTreeSet.addAll(integerTreeSet);
		System.out.println(anotherIntegerTreeSet);
		System.out.println(anotherIntegerTreeSet.size());
		
		System.out.println("Lower:" + anotherIntegerTreeSet.lower(3));
		System.out.println("Higher:" + anotherIntegerTreeSet.higher(3));
		System.out.println("Floor:" + anotherIntegerTreeSet.floor(3));
		System.out.println("Ceiling:" + anotherIntegerTreeSet.ceiling(3));
		System.out.println("PollFirst():" + anotherIntegerTreeSet.pollFirst());
		System.out.println("PollLast():" + anotherIntegerTreeSet.pollLast());
		anotherIntegerTreeSet.retainAll(integerTreeSet);
		System.out.println(anotherIntegerTreeSet);

	}

}

