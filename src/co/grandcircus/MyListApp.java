package co.grandcircus;

public class MyListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("arrayLists:");

		MyList<Integer> aList = new MyArrayList<>();

		aList.addAtEnd(1);
		aList.addAtEnd(2);
		aList.addAtEnd(3);
		aList.addAtEnd(4);
		aList.addAtEnd(5);

		aList.insertAt(1, 50);

		System.out.println(aList);

		aList.removeAt(1);

		System.out.println(aList);

		System.out.println("linkedLists:");

		MyList<String> lList = new MyLinkedList<>();

		lList.addAtEnd("1");

		System.out.println(lList);

		lList.addAtEnd("2");
		lList.addAtEnd("3");
		lList.addAtEnd("4");
		lList.addAtEnd("5");

		System.out.println(lList);

		lList.insertAt(1, "Hello");

		System.out.println(lList);

		lList.removeAt(1);

		System.out.println(lList);

		lList.removeFromEnd();

		System.out.println(lList);

		lList.removeFromEnd();

		System.out.println(lList);

		lList.removeFromEnd();

		System.out.println(lList);

		lList.removeFromEnd();

		System.out.println(lList);

	}

}
