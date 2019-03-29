package by.epam.javatraining.glazunov.task02.model.container.array;

import by.epam.javatraining.glazunov.task02.model.container.ListOwnCollection;

public interface ArrayList extends ListOwnCollection {
	boolean add(Object object);

	Object get(int index);

	void set(int index, Object object);

	boolean remove(int index);

}
