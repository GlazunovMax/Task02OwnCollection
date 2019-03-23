package by.epam.javatraining.glazunov.task02.model.container;



public interface ListOwnCollection { //<E> extends Iterable<E> {
	int size();

	boolean isEmpty();

	//Iterator<E> iterator();

	boolean equals(Object o);

	int hashCode();

	String toString();
}
