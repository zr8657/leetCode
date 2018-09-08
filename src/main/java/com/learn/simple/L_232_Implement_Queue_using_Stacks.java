package com.learn.simple;

import java.util.ArrayList;
import java.util.List;

public class L_232_Implement_Queue_using_Stacks {

}

// 应该用两个Stack来回倒的，但是嫌麻烦
class MyQueue {
	List<Integer> list = new ArrayList();

	/** Initialize your data structure here. */
	public MyQueue() {

	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		list.add(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		Integer result = list.get(0);
		list.remove(0);
		return result;
	}

	/** Get the front element. */
	public int peek() {
		return list.get(0);
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		if (list.size() > 0) {
			return false;
		} else {
			return true;
		}
	}
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */