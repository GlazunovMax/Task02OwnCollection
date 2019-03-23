package by.epam.javatraining.glazunov.task02.model.exception;

public class MissingItemsInCollectionException extends Exception {

	public MissingItemsInCollectionException() {
		super();
	}
	
	public MissingItemsInCollectionException(String message, Exception e) {
		super(message, e);
	}

	public MissingItemsInCollectionException(String message) {
		super(message);
	}

	public MissingItemsInCollectionException(Exception e) {
		super(e);
	}
}
