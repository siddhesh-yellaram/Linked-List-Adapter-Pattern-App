package com.techlab.model;

public class LinkedListAdapter<E> implements IQueue {

	private Queue<E> q;
	
	public LinkedListAdapter(Queue q){
		this.q = q;
	}
	
	@Override
	public String toString() {
		return " "+q;
	}

	@Override
	public void enque(Object o) {
		this.q.enque((E) o);
	}

	@Override
	public void deque() {
		this.q.deque();
	}
	
}
