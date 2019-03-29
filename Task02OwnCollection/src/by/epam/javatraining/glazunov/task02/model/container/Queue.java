package by.epam.javatraining.glazunov.task02.model.container;

import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;

public interface Queue extends ListOwnCollection {
	public void add(int data);

	public void remove() throws MissingItemsInCollectionException;

}
