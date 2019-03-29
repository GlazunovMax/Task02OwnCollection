package by.epam.javatraining.glazunov.task02.model.container.array;

import by.epam.javatraining.glazunov.task02.model.container.Stack;
import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;

public class StackArrayList extends MyArrayList implements Stack {

	@Override
	public void push(int data) {
		add(data);
	}

	@Override
	public boolean pop() throws MissingItemsInCollectionException {
		if (!isEmpty()) {
			return remove(size() - 1);
		} else {
			throw new MissingItemsInCollectionException("ArrayStack is empty...");
		}

	}

}
