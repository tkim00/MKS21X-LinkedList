public class MyLinkedList {
	private int size;
	private Node start, end;

	public MyLinkedList() {
		size = 0;
		start = null;
		end = null;
	}

	public int size() {
		return size;
	}
	public boolean add(int value) {
		Node addition = new Node(value);
		if (size = 0) {
			start = addition;
			end = addition;
		} else {
			addition.setPrev(end);
			end.setNext(addition);
			end = addition;
		}
		size++;
		return true;
	}
	public String toString() {
		Node current = start;
		String result = "{ ";
		while (current.next() != null) {
			result += current.getData() + ", ";
			current = current.next();
		}
		result += end.getData() + "}";
	}


	private Node getNthNode(int n) {
		Node current = start;
		for (int c = 0; c < n; c++) {
			current = current.next();
		}
		return current;
	}


	public Integer get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("index is out of range");
		}
		return getNthNode(index).getData();
	}
	public Integer set(int index, Integer value) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("index is out of range");
		}
		getNthNode(index).setData(value);
	}
	public boolean contains(Integer value) {
		Node current = start;
		while (current != null) {
			if (current.getData() == value) {
				return true;
			}
			current = current.next();
		}
		return false;
	}
	public int indexOf(Integer value) {
		Node current = start;
		int c = 0;
		while (current != null) {
			if (current.getData() == value) {
				return c;
			}
			c++;
		}
		return -1;
	}
	public void add(int index, Integer value) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("index is out of range");
		}
		Node addition = new Node(value);
		getNthNode(index).prev() = addition;
		addition.next() = getNthNode(index);
		if (index != 0) {
			getNthNode(index-1).next() == addition;
			addition.prev() = getNthNode(index-1);
		} else {
			start = addition;
		}
		size++;
	}
}
