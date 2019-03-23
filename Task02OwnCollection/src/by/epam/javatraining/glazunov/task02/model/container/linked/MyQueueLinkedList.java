package by.epam.javatraining.glazunov.task02.model.container.linked;

import by.epam.javatraining.glazunov.task02.model.container.IMyQueue;
import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;

public class MyQueueLinkedList implements IMyQueue {
	
	private MyLinkedList linkedList = new MyLinkedList();

	public MyQueueLinkedList() {}
	
	public int size() {
		return linkedList.size();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	public void add(int data) {
		linkedList.addTail(data);
	}
	
	public void remove() throws MissingItemsInCollectionException {
		if(!isEmpty()) {
			linkedList.removeHead();
		}else {
			throw new MissingItemsInCollectionException("LinkedQueue is empty...");
		}
		
	}
	

}
