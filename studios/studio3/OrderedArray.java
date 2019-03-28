package studio3;

public class OrderedArray<T extends Comparable<T>> implements PriorityQueue<T> {

	public T[] array;
	private int size;
	
	@SuppressWarnings("unchecked")
	public OrderedArray(int maxSize) {
		array = (T[]) new Comparable[maxSize];
		size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		//
		// FIXME
		//
		if (array[0] == null) {
			return true;
		}
		return false;
	}

	@Override
	public void insert(T thing) {
		//
		// FIXME
		//
		int bredth = array.length;
		for (int i = 0; i < bredth; i++) {
			if (array[i] == null) {
				array[i] = thing; 
				return;
			}
		}
		return; 
			
	}
	
	@Override
	public T extractMin() {
		//
		// FIXME
		//
		int bredth = array.length;
		array[bredth +1 ] = array[bredth];
		for (int i = 0; i < size; i++) {
			if (array[i].compareTo(array[bredth+1]) > 0) {
				array[bredth+1] = array[i];
			}
		}
		return null;
	}

}
