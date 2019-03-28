package studio3;

import java.util.LinkedList;
import java.util.List;

import studio2.lists.ListNode;

public class UnorderedList<T extends Comparable<T>> implements PriorityQueue<T> {

	public LinkedList<T> list;
	
	public UnorderedList() {
		list = new LinkedList<T>();
		//private ListNode<T> head;
		//this.head = null;
	}
	
	@Override
	public boolean isEmpty() {
		//
		// FIXME
		//
//		transient Node<T> first;
//		if Node<T>.next != null then return true
//		else return false;
		if (list.size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void insert(T thing) {
		//
		// FIXME
		//
		list.addLast(thing);
		return;
	}

	@Override
	public T extractMin() {
		u = new LinkedList<T>();
		//
		// FIXME
		//
		U = getFirst(list);
		 
		for (int i = 0; i < list.size(); i++ ) {
			i
		}
	}

}
