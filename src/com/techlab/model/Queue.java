package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Queue<E> implements IQueue {
	private List<E> list;
	private int size;

	public Queue(List<E> list) {
		this.list = list;
		this.size = list.size();
	}

	public Queue() {
		this.list = new ArrayList<E>();
		this.size = list.size();
	}

	@Override
	public void enque(Object o) {
		this.list.add((E) o);
		this.size += 1;
	}

	@Override
	public void deque() {
		try {
			this.list.remove(this.size - list.size());
			this.size -= 1;
		} catch (Exception e) {}
	}

	public int count() {
		return this.size;
	}

	@Override
	public String toString() {
		String str = "";
		for (Object o : list) {
			str = str + o + " ";
		}
		return str;
	}
}
