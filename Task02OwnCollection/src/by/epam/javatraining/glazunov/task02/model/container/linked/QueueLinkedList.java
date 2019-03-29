package by.epam.javatraining.glazunov.task02.model.container.linked;

import by.epam.javatraining.glazunov.task02.model.container.Queue;
import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;

public class QueueLinkedList extends MyLinkedList implements Queue {
	public void add(int data) {
		addTail(data);
	}

	public void remove() throws MissingItemsInCollectionException {
		if (!isEmpty()) {
			removeHead();
		} else {
			throw new MissingItemsInCollectionException("LinkedQueue is empty...");
		}

	}

}
