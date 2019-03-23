package by.epam.javatraining.glazunov.task02.model.container.linked;

import by.epam.javatraining.glazunov.task02.model.container.ListOwnCollection;

public interface IMyLinkedList extends ListOwnCollection  {

	public void addAt(int index, int value);

	public void addTail(int value);

	public void addHead(int value);

	public int get(int index);

	public int getHead();

	public int getTail();

	public void removeHead();

	public boolean removeTail();

	public void remove(int index);

}
