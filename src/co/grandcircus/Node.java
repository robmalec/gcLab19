package co.grandcircus;

public class Node<T> {
	private Node next =  null; //We have a node inside of itself
	private T data = null;
	
	public Node() {}
	public Node(Node next, T data) {
		this.data = data;
		this.next = next;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (next != null) {
			return data.toString() + " -> ";
		}
		else {
			return data.toString();
		}
	}
	
	
}
