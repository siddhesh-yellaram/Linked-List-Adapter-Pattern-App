package com.techlab.test;

import com.techlab.model.LinkedListAdapter;
import com.techlab.model.Queue;

public class LinkedListAdapterTest {
	public static void main(String[] args) {
		Queue q1 = new Queue();
		LinkedListAdapter<Integer> ll = new LinkedListAdapter<Integer>(q1);
		ll.enque(44);
		ll.enque(75);
		ll.enque(84);
		ll.enque(76);
		ll.enque(44);
		ll.enque(69);
		System.out.println("After Adding Elements: "+ll.toString());
		ll.deque();
		System.out.println("After Removing Elements: "+ll.toString());
	}
}
