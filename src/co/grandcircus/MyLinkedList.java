package co.grandcircus;

public class MyLinkedList<T> implements MyList<T> {

	private Node head;
	private Node tail;
	private int myLength = 0;
	
	@Override
	public void addAtBeginning(T data) {
		Node prevHead = head;
		head = new Node(head,data);
		head.setNext(prevHead);
		myLength++;
		
		if (myLength == 1) {
			tail = head;
		}
	}

	@Override
	public void removeFromBeginning() {
		head = head.getNext();
		myLength--;
	}

	@Override
	public void addAtEnd(T data) {
		if (myLength == 0) {
			head = new Node(null, data);
			tail = head;
		}
		
		Node n = new Node();
		n.setData(data);
		tail.setNext(n);
		tail = tail.getNext();
		
		myLength++;
	}

	@Override
	public void removeFromEnd() {
		Node thisNode = head;
		
		while (thisNode.getNext() != tail) {
			thisNode = thisNode.getNext();
		}
		
		tail = thisNode.getNext();
		myLength--;
	}
	
	@Override
	public void insertAt(int index, T elt) {
		Node thisNode = getNode(index);
		Node nextNode = thisNode.getNext();
		thisNode.setNext(new Node(nextNode,elt));
		
		myLength++;
	}
	
	@Override
	public void removeAt(int index) {
		Node thisNode = getNode(index);
		thisNode.setNext(thisNode.getNext().getNext());
		
		myLength--;
		
	}
	
	@Override
	public T get(int index) {
		return (T) getNode(index).getData();
	}

	@Override
	public int size() {
		return myLength;
	}
	
	private Node getNode(int index) {
		Node thisNode = head;
		for (int i = 0; i < index; i++) {
			thisNode = thisNode.getNext();
		}
		return thisNode;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("\\|");
		//follow the links between the nodes until it reaches the end
		Node node = head;
		
		int counter = 0;
		
		do {
			sb.append(node);
			node = node.getNext();
		} while (node != null);
		
		sb.append("|/");
		
		return sb.toString();
		
	}
}
