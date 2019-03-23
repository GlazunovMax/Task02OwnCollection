package by.epam.javatraining.glazunov.task02.model.container.array;

import by.epam.javatraining.glazunov.task02.model.container.IMyStack;
import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;

public class MyStackArrayList implements IMyStack {

	private MyArrayList myArraylist;

	public MyStackArrayList() {
		myArraylist = new MyArrayList();
	}

	@Override
	public void push(int data) {
		myArraylist.add(data);
	}

	@Override
	public boolean pop() throws MissingItemsInCollectionException {
		if (!isEmpty()) {
			return myArraylist.remove(myArraylist.size() - 1);
		} else {
			throw new MissingItemsInCollectionException("ArrayStack is empty...");
		}

	}

	@Override
	public int size() {
		return myArraylist.size();
	}

	@Override
	public boolean isEmpty() {
		return myArraylist.isEmpty();
	}

}
