package by.epam.javatraining.glazunov.task02.model.container.array;

public class MyArrayList implements ArrayList {
	private Object[] objects;

	public MyArrayList() {
		objects = new Object[0];
	}

	@Override
	public boolean add(Object object) {
		Object[] temp = objects;
		objects = new Object[temp.length + 1];
		System.arraycopy(temp, 0, objects, 0, temp.length);
		objects[objects.length - 1] = object;
		return true;
	}

	@Override
	public Object get(int index) {
		return objects[index];
	}

	@Override
	public void set(int index, Object object) {
		objects[index] = object;
	}

	@Override
	public boolean remove(int index) {

		Object[] temp = objects;
		objects = new Object[temp.length - 1];
		System.arraycopy(temp, 0, objects, 0, index);

		int amountElementAfterIndex = temp.length - 1;
		System.arraycopy(temp, index + 1, objects, index, amountElementAfterIndex);
		return true;
	}

	@Override
	public int size() {
		return objects.length;
	}

	@Override
	public boolean isEmpty() {
		return objects.length == 0;
	}

	/*
	 * @Override public Iterator<Object> iterator() { return new
	 * ArrayIterator(objects); }
	 */
}
