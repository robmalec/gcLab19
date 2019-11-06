package co.grandcircus;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

	private Object[] arr = new Object[2];
	int myLength = 0;
	
	//We will use this method as a helper method inside this class 
	private boolean isFull() {
		return (myLength == arr.length);
	}
	
	//We will use this as a helper method as well to dynamically increase the size of the array
	private void doubleLength() {
		arr = Arrays.copyOf(arr, (2*arr.length));
	}
	
	@Override
	public void addAtBeginning(T data) {
		if (isFull()) {
			doubleLength();
		}
		
		//Loop backwards and shift all the items over to make room for the new data
		shiftTowardEnd(1);
		
		arr[0] = data;
		myLength++;
	}

	@Override
	public void removeFromBeginning() {
		// TODO Auto-generated method stub
		shiftFromEnd(0);
		myLength--;
	}

	@Override
	public void addAtEnd(T data) {
		// TODO Auto-generated method stub
		if (isFull()) {
			doubleLength();
		}
		
		arr[myLength] = data;
		myLength++;
	}

	@Override
	public void removeFromEnd() {
		myLength--;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		if (index >= myLength) {
			throw new ArrayIndexOutOfBoundsException("Index out of bounds");
		}
		return (T) arr[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return myLength;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < myLength; i++) {
			sb.append(arr[i]);
			if (i != (myLength - 1)) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public void insertAt(int index, T elt) {
		// TODO Auto-generated method stub
		if (isFull()) {
			doubleLength();
		}
		
		shiftTowardEnd(index);
		
		arr[index] = (Object) elt;
		myLength++;
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		shiftFromEnd(index);
		myLength--;
	}
	
	private void shiftTowardEnd(int startingPoint) {
		for (int i = myLength; i >= startingPoint; i--) {
			arr[i] = arr[i - 1];
		}
	}
	
	private void shiftFromEnd(int startingPoint) {
		for (int i = startingPoint; i < (myLength - 1); i++) {
			arr[i] = arr[i + 1];
		}
	}

}
