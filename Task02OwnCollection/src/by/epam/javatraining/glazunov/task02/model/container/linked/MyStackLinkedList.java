package by.epam.javatraining.glazunov.task02.model.container.linked;

import by.epam.javatraining.glazunov.task02.model.container.IMyStack;
import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;

public class MyStackLinkedList implements IMyStack {
	
	private MyLinkedList myLinkedList = new MyLinkedList();

	public MyStackLinkedList() {}
	
	public int size() {
		return myLinkedList.size();
	}
	
	public boolean isEmpty() {
		return myLinkedList.isEmpty();
	}

	@Override
	public void push(int data) {
		myLinkedList.addHead(data);
		
	}

	@Override
	public boolean pop() throws MissingItemsInCollectionException {
		if(!isEmpty()) {
			return myLinkedList.removeTail();
		}else {
			throw new MissingItemsInCollectionException("LinkedStack is empty...");
		}
	}

}
