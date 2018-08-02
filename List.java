package project1;

import java.util.Arrays;
import java.util.LinkedList;


public class List {
	Node head;
	static LinkedList<Item> theList = new <Item>LinkedList<Item>();
	
	public List() {
		
	}
	
	
	
	/*
	public void append(Item theItem) {
		if(head == null) {
			head = new Node(theItem);
			return;
		}
		Node current  = head;
		while(current != null) {
			current =  current.next;
		}
	}
	
	public void prepend(Item theItem) {
		Node newHead = new Node(theItem);
		newHead.next = head;
		
	}
	
	public void deleteWithValue(Item theItem) {
		if(head == null) { return; }
		if(head.item == theItem) {
			head = head.next;
			return;
		}
		
		Node current =  head ;
		while(current != null) {
			if(current.next.item == theItem) {
				current.next = current.next.next;
				return;
			}
			else {
				current = current.next;
			}
		}
	}*/
	
	
	
	public static void main(String[] args) {
		Item appel = new Item("appel", "10.51");
		theList.add(appel);
		//System.out.println(theList);
		
		System.out.println(Arrays.toString(theList.toArray()));
		
		
	}

}
