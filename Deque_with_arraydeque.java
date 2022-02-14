package Deque;

import java.util.ArrayDeque;
import java.util.Iterator;

class Deque_with_arraydeque {
	public static void main(String[] args) {

		ArrayDeque<String> animals= new ArrayDeque<>();
		// Using add()
		animals.add("Dog");
		// Using addFirst()
		animals.addFirst("Cat");
		// Using addLast()
		animals.addLast("Horse");
		System.out.println("~~~~~~~~~~~~~ Deque with ArrayDeque ~~~~~~~~~~~~~");
		System.out.println("1. Add elements using add(), addFirst() and addLast()");
		System.out.println("ArrayDeque: " + animals);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		ArrayDeque<String> birds= new ArrayDeque<>();
		// Using offer()
		birds.offer("Peacock");
		// Using offerFirst()
		birds.offerFirst("Parrot");
		// Using offerLast()
		birds.offerLast("Sparrow");
		System.out.println("2. Insert elements using offer(), offerFirst() and offerLast()");
		System.out.println("ArrayDeque: " + birds);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



		System.out.println("3. Access elements using getFirst() and getLast()");
		// Get the first element
		String firstElement = animals.getFirst();
		System.out.println("First Element: " + firstElement);
		// Get the last element
		String lastElement = animals.getLast();
		System.out.println("Last Element: " + lastElement);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		System.out.println("4. Access elements using peek(), peekFirst() and peekLast() method");
		ArrayDeque<String> animals2= new ArrayDeque<>();
		animals2.add("Dog");
		animals2.add("Cat");
		animals2.add("Horse");
		System.out.println("ArrayDeque: " + animals2);
		// Using peek()
		String element1 = animals2.peek();
		System.out.println("Head Element: " + element1);
		// Using peekFirst()
		String firstElement1 = animals2.peekFirst();
		System.out.println("First Element: " + firstElement1);
		// Using peekLast
		String lastElement1 = animals2.peekLast();
		System.out.println("Last Element: " + lastElement1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		System.out.println("5. Remove elements using the remove(), removeFirst(), removeLast() method");
		// Using remove()
		String element = animals.remove();
		System.out.println("Removed Element: " + element);
		System.out.println("New ArrayDeque: " + animals);
		// Using removeFirst()
		String firstElement2 = animals.removeFirst();
		System.out.println("Removed First Element: " + firstElement2);
		// Using removeLast()
		String lastElement2 = animals.removeLast();
		System.out.println("Removed Last Element: " + lastElement2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		System.out.println("6. Remove elements using the poll(), pollFirst() and pollLast() method");
		// Using poll()
		String element4 =birds.poll();
		System.out.println("Removed Element: " + element4);
		System.out.println("New ArrayDeque: " + birds);
		// Using pollFirst()
		String firstElement3 = birds.pollFirst();
		System.out.println("Removed First Element: " + firstElement3);
		// Using pollLast()
		String lastElement3 = birds.pollLast();
		System.out.println("Removed Last Element: " + lastElement3);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		System.out.println("7.Iterating the ArrayDeque");
		ArrayDeque<String> animals3= new ArrayDeque<>();
		animals3.add("Dog");
		animals3.add("Cat");
		animals3.add("Horse");
		System.out.print("ArrayDeque: ");
		// Using iterator()
		Iterator<String> iterate = animals3.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		System.out.print("\nArrayDeque in reverse order: ");
		// Using descendingIterator()
		Iterator<String> desIterate =animals3.descendingIterator();
		while(desIterate.hasNext()) {
			System.out.print(desIterate.next());
			System.out.print(", ");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}