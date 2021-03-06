package by.epam.javatraining.glazunov.task02.model.container;

import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;

public interface Stack extends ListOwnCollection {

	public void push(int data);

	public boolean pop() throws MissingItemsInCollectionException;

}
