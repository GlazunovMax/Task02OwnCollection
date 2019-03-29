package by.epam.javatraining.glazunov.task02.model.container.linked;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyLinkedList implements LinkedList {
	private Node head; 
	private Node tail;
	private int size; //р-р LinkedList
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0; //head == null;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void addAt(int index, int value) {
		checkIndex(index);

		if(head == null) {
			return;
		}
		
		Node temp = head;
		int currentIndex = 0;
		while(currentIndex < index) {
			temp = temp.getNext();
			currentIndex++;
		}
		
		if(temp.prev == null) {
			Node addNode = new Node(null, value, temp);//если вставляем в позицию 0 в начало
			temp.prev = addNode;
			head = addNode;
		}else {
			Node addNode = new Node(temp.prev, value, temp);
			temp.prev.next = addNode;
			temp.prev = addNode;
		}
		size++;
	}
	
	@Override
	public void addTail(int value) { 
		Node newNode = new Node(null, value, null);
		if(isEmpty()) {//isEmpty head == null
			this.head = newNode;//при первом добавлении в список, нужно инициализировать голову
		}else {
			tail.next = newNode;
			newNode.prev = tail;
		}
		this.tail = newNode;
		size++;	
	}
	
	@Override
	public void addHead(int value) {
		Node newNode = new Node(null, value, null);
		if(isEmpty()) {//isEmpty head == null
			this.tail = newNode; 
		}else {
			head.prev = newNode; //newHead;
		}
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	@Override
	public int get(int index) {
		int currenIndex = 0;
		Node temp = head;
		
		
		while (temp != null) {
			if(currenIndex == index) {
				return temp.getItem();
			}else {
				temp = temp.getNext();
				currenIndex++;
			}
		}
		throw new IllegalArgumentException("Index: "+index+", Size: "+size);//если нет такого индекса в списке
	}
	
	@Override
	public int getHead() {
		checkLinkedListIsEmpty();
		return head.getItem();
	}
	
	@Override
	public int getTail() {
		checkLinkedListIsEmpty();
		return tail.getItem();	
	}
	
	@Override
	public void removeHead() {
		checkLinkedListIsEmpty();
		
		Node temp = head;
		if(head == tail) {
			tail = null;
		}else {
			temp.next.prev = null;
		}
		head = head.getNext();
		temp.next = null;
		size--;
	}
	
	@Override
	public boolean removeTail() {
		checkLinkedListIsEmpty();
		
		Node temp = tail;
		if(head == tail) {//если в коллекции 1элементNodeheadtail
			head = null;
		}else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		temp.prev = null;
		size--;
		
		return true;
	}
	
	@Override
	public void remove(int index) {
		if(head == null) {
			return;
		}
		
		checkIndex(index);
		
		Node temp = head;
		int currentIndex = 0;
		while (currentIndex < index) {//находим место удаляемого эл-та
			temp = temp.getNext();
			currentIndex++;
		}
		
		if(temp.next == null) {
			//temp.prev.next = null;
			
			temp = temp.getPrev();
			temp.next = null;
			tail = temp;
			
		}else if(temp.prev == null) {
			temp = temp.getNext();
			temp.prev = null;
			head = temp;
		}else {
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}
		size--;	
	}
	
	@Override
	public String toString() {
		int[] result = new int[size];
		
		int index = 0;
		Node temp = head;
		
		while (temp != null) {
			result[index++] = temp.getItem();
			temp = temp.getNext();
		}
		
		return Arrays.toString(result);
	}
	
	public void checkLinkedListIsEmpty() {
		if(isEmpty()) {
			throw new NoSuchElementException("LinkedList is empty...");
		}
	}
	
	public void checkIndex(int index) {
		if (index < 0 && index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
	}
	
	


	private static class Node {
		private int item;
		private Node next;
		private Node prev;

		public Node(Node prev, int item, Node next) {
			super();
			this.prev = prev;
			this.item = item;
			this.next = next;
		}

		public int getItem() {
			return item;
		}

		public Node getNext() {
			return next;
		}

		public Node getPrev() {
			return prev;
		}
		
	}

}
