
package javaapplication172;

public class JavaApplication172 {

    
    public static void main(String[] args) {
        MyLinkedList<String> l = new MyLinkedList<>();
        System.out.println(l.size);
        
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        System.out.println(l.remove(7));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.get(2));
        
        
        l.addFirst("Ahmad");
        System.out.println(l.getFirst());
        System.out.println(l.size);
        l.addLast("Salem");
        System.out.println(l.size);
        
        l.printFor();
            l.printWhile();
            
        l.add(15, "Mahmoud");
        l.printFor();
        System.out.println("------------------");
        l.removeFirst();
        l.printFor();
        
        System.out.println("------------------");
        l.removeLast();
        l.printFor();
         System.out.println("------------------");
        l.addFirst("Shaker");
        l.addLast("shokri");
        l.printWhile();
        System.out.println("------------------");
        System.out.println(l.remove(1));
        
        System.out.println("------------------");
        l.printWhile();
        
    }
    
}

 interface MyList<E> extends java.lang.Iterable<E> {
 /** Add a new element at the end of this list */
 public void add(E e);

 /** Add a new element at the specified index in this list */
 public void add(int index, E e);

 /** Clear the list */
 public void clear();

 /** Return true if this list contains the element */
 public boolean contains(E e);

 /** Return the element from this list at the specified index */
 public E get(int index);

 /** Return the index of the first matching element in this list.
 * Return -1 if no match. */
 public int indexOf(E e);

 /** Return true if this list doesn't contain any elements */
 public boolean isEmpty();

 /** Return the index of the last matching element in this list
 * Return -1 if no match. */
 public int lastIndexOf(E e);

 /** Remove the first occurrence of the element e from this list.
 * Shift any subsequent elements to the left.
 * Return true if the element is removed. */
 public boolean remove(E e);

 /** Remove the element at the specified position in this list.
 * Shift any subsequent elements to the left.
 * Return the element that was removed from the list. */
 public E remove(int index);

 /** Replace the element at the specified position in this list
 * with the specified element and return the old element. */
 public Object set(int index, E e);

 /** Return the number of elements in this list */
 public int size();
 }

abstract class MyAbstractList<E> implements MyList<E> {
 protected int size = 0; // The size of the list

 /** Create a default list */
 protected MyAbstractList() {
 }

 /** Create a list from an array of objects */
 protected MyAbstractList(E[] objects) {
 for (int i = 0; i < objects.length; i++)
 add(objects[i]);
 }

 @Override /** Add a new element at the end of this list */
 public void add(E e) {
 add(size, e);
 }

 @Override /** Return true if this list doesn't contain any elements */
 public boolean isEmpty() {
 return size == 0;
 }

 @Override /** Return the number of elements in this list */
 public int size() {
 return size;
 }

 @Override /** Remove the first occurrence of the element e
 * from this list. Shift any subsequent elements to the left.
 * Return true if the element is removed. */
 public boolean remove(E e) {
 if (indexOf(e) >= 0) {
 remove(indexOf(e));
 return true;
 }
 else
 return false;
 }
 }



class Node<E> {
E element;
Node<E> next;
public Node(E e) {
element = e;
}
}

class MyLinkedList<E> extends MyAbstractList<E> {
 private Node<E> head, tail;

 /** Create a default list */
 public MyLinkedList() {
 }

 /** Create a list from an array of objects */
 public MyLinkedList(E[] objects) {
 super(objects);
 }

 /** Return the head element in the list */
 public E getFirst() {
 if (size == 0) {
 return null;
 }
 else {
 return head.element;
 }
 }

  public void addFirst(E e) {
 Node<E> newNode = new Node<>(e); // Create a new node
 newNode.next = head; // link the new node with the head
 head = newNode; // head points to the new node
 size++; // Increase list size

 if (tail == null) // The new node is the only node in list
 tail = head;
 }
 
 public void addLast(E e) {
 Node<E> newNode = new Node<>(e); // Create a new node for e

 if (tail == null) {
 head = tail = newNode; // The only node in list
 }
 else {
 tail.next = newNode; // Link the new node with the last node
 tail = tail.next; // tail now points to the last node
 }

 size++; // Increase size
 }
  
  public void add(int index, E e) {
 if (index == 0) addFirst(e); // Insert first
 else if (index >= size) addLast(e); // Insert last
 else { // Insert in the middle
 Node<E> current = head;
 for (int i = 1; i < index; i++)
 current = current.next;
 Node<E> temp = current.next;
 current.next = new Node<E>(e);
 (current.next).next = temp;
 size++;
 }
 }

  public E removeFirst() {
 if (size == 0) return null; // Nothing to delete
 else {
        
       Node<E> temp = head; // Keep the first node temporarily
 head = head.next; // Move head to point to next node
 size--; // Reduce size by 1
 if (head == null) tail = null; // List becomes empty
 return temp.element; // Return the deleted element
 }
 }
  
  public E removeLast() {
 if (size == 0) return null; // Nothing to remove
 else if (size == 1) { // Only one element in the list
 Node<E> temp = head;
 head = tail = null; // list becomes empty
 size = 0;
 return temp.element;
 }
 else {
 Node<E> current = head;

 for (int i = 0; i < size - 2; i++)
 current = current.next;

 Node<E> temp = tail;
 tail = current;
 tail.next = null;
 size--;
 return temp.element;
 }
 }
  
   public E remove(int index) {
 if (index < 0 || index >= size) return null; // Out of range
 else if (index == 0) return removeFirst(); // Remove first
 else if (index == size - 1) return removeLast(); // Remove last
 else {
 Node<E> previous = head;

 for (int i = 1; i < index; i++) {
 previous = previous.next;
 }

 Node<E> current = previous.next;
 previous.next = current.next;
 size--;
 return current.element;
 }
 }
   
  
 /** Return the last element in the list */
 public E getLast() {
 if (size == 0) {
 return null;
 }
 else {
 return tail.element;
 }
 }
 
 
 
 @Override
 public String toString() {
 StringBuilder result = new StringBuilder("[");

 Node<E> current = head;
 for (int i = 0; i < size; i++) {
 result.append(current.element);
 current = current.next;
 if (current != null) {
 result.append(", "); // Separate two elements with a comma
 }
 else {
 result.append("]"); // Insert the closing ] in the string
 }
 }

 return result.toString();
 }

 @Override /** Clear the list */
 public void clear() {
 size = 0;
 head = tail = null;
 }

 @Override /** Return true if this list contains the element e */
 public boolean contains(E e) {
 System.out.println("Implementation left as an exercise");
 return true;
 }

 @Override /** Return the element at the specified index */
 public E get(int index) {
 System.out.println("Implementation left as an exercise");
 return null;
 }

 @Override /** Return the index of the head matching element
 * in this list. Return -1 if no match. */
 public int indexOf(E e) {
 System.out.println("Implementation left as an exercise");
 return 0;
 }

 @Override /** Return the index of the last matching element
 * in this list. Return -1 if no match. */
 public int lastIndexOf(E e) {
 System.out.println("Implementation left as an exercise");

 return 0;
 }

 @Override /** Replace the element at the specified position
 * in this list with the specified element. */
 public E set(int index, E e) {
 System.out.println("Implementation left as an exercise");
 return null;
 }

 @Override /** Override iterator() defined in Iterable */
 public java.util.Iterator<E> iterator() {
 return new LinkedListIterator();
 }

 private class LinkedListIterator
 implements java.util.Iterator<E> {
 private Node<E> current = head; // Current index

 @Override
 public boolean hasNext() {
 return (current != null);
 }

 @Override
 public E next() {
 E e = current.element;
 current = current.next;
 return e;
 }

 @Override
 public void remove() {
 System.out.println("Implementation left as an exercise");
 }
 }
 
 
 public void printFor(){
     Node<E> current = head;
     for(int i=1; i<=size;i++){
         System.out.println(current.element);
         current = current.next;
     }
 }
 
 public void printWhile(){
     Node<E> current = head;
     while(current!=null){
         System.out.println(current.element);
         current = current.next;
     }
 }
}
