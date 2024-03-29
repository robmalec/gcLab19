package co.grandcircus;

import java.util.HashMap;

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
		
		aList.removeFromBeginning();
		aList.removeFromBeginning();
		
		System.out.println(aList);
		
		aList.removeFromEnd();
		aList.removeFromEnd();
		aList.removeFromEnd();
		aList.removeFromEnd();
		aList.removeFromEnd();
		
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

		lList.addAtEnd("50");

		System.out.println(lList);

		lList.addAtEnd("50");

		System.out.println(lList);

		lList.removeFromBeginning();

		System.out.println(lList);

		lList.removeFromBeginning();

		System.out.println(lList);
		
		lList.removeFromBeginning();
		
		System.out.println(lList);

	}
	
	/*
	 * Both of these are Big-O of n because they're iterating linearly through a list of n elements, going over each one exactly once.
	 */
	
	public static HashMap<Integer,Integer> mapCountNumFrequency(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int temp = 0;
		for (int i : arr) {
			if (map.containsKey(i)) {
				temp = map.get(i) + 1;
				map.put(i, temp);
			}
			else {
				map.put(i,0);
			}
		}
		
		return map;
	}
	
	public static int[] arrCountNumFrequency(int[] arr) {
		int[] rArr = new int[11];
		for (int i=0; i < rArr.length; i++) {
			rArr[i] = 0;
		}
		for (int i : arr) {
			rArr[i]++;	
		}
		return rArr;
	}

}
