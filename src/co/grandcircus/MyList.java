package co.grandcircus;


public interface MyList<T> {
	void addAtBeginning(T data);
	void removeFromBeginning();
	
	void addAtEnd(T data);
	void removeFromEnd();
	
	void insertAt(int index, T elt);
	void removeAt(int index);
	
	T get(int index);
	
	int size(); //An indicator of how many items are in the list
}
