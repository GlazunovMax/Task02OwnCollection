package by.epam.javatraining.glazunov.task02.model.container.array;

import by.epam.javatraining.glazunov.task02.model.container.Queue;
import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;


public class QueueArrayList extends MyArrayList implements Queue {
	@Override
	public void add(int data) {
		add(data);
		
	}

	@Override
	public void remove() throws MissingItemsInCollectionException {
		if(!isEmpty()) {
			remove(size() - 1);
		}else {
			throw new MissingItemsInCollectionException("ArrayQueue is empty...");
		}
	
	}

}
