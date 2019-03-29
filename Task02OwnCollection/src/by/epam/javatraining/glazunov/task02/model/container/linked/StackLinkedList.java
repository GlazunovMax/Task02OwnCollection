package by.epam.javatraining.glazunov.task02.model.container.linked;

import by.epam.javatraining.glazunov.task02.model.container.Stack;
import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;

public class StackLinkedList extends MyLinkedList implements Stack {

	@Override
	public void push(int data) {
		addHead(data);
	}

	@Override
	public boolean pop() throws MissingItemsInCollectionException {
		if (!isEmpty()) {
			return removeTail();
		} else {
			throw new MissingItemsInCollectionException("LinkedStack is empty...");
		}
	}

}
