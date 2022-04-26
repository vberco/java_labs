package lab_2;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
	private int MaxSize;
	public List<T> Store;
		
	public Queue(int maxSize) {
		this.MaxSize = maxSize;
		this.Store = new LinkedList<T>();
	}
	
	public Queue() {
		this.MaxSize = -1;
		this.Store = new LinkedList<T>();
	}

	public int GetState() {
		return Store.size();
	}

	@Override
	public String toString() {
		return "Queue [Store=" + Store + "]";
	}
	
	public void Push(T value) throws Exception {
		if (MaxSize == -1) {
			Store.add(value);
		}
		else {
			if (GetState() == MaxSize) {
				throw new Exception("Queue is full");
			}
			
			Store.add(value);
		}
	}
	
	public T Pop(boolean last) {
		var index = 0;

		if (last) {
			index = GetState() - 1;
		}
		
		return Store.remove(index);
	}
	
	public boolean IsEmpty() {
		return Store.isEmpty();
	}
	
	public boolean IsFull() {
		if (MaxSize == -1) {
			return false;
		}
		
		return MaxSize == GetState();
	}
}
