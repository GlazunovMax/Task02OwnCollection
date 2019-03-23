package by.epam.javatraining.glazunov.task02.model.container.array;

import by.epam.javatraining.glazunov.task02.model.container.IMyQueue;
import by.epam.javatraining.glazunov.task02.model.exception.MissingItemsInCollectionException;


public class MyQueueArrayList implements IMyQueue {
	private MyArrayList myArrayList = new MyArrayList();

	public MyQueueArrayList() {}

	@Override
	public int size() {
		return myArrayList.size();
	}

	@Override
	public boolean isEmpty() {
		return myArrayList.isEmpty();
		
	}

	@Override
	public void add(int data) {
		myArrayList.add(data);
		
	}

	@Override
	public void remove() throws MissingItemsInCollectionException {
		if(!isEmpty()) {
			myArrayList.remove(size() - 1);
		}else {
			throw new MissingItemsInCollectionException("ArrayQueue is empty...");
		}
	
	}

}
