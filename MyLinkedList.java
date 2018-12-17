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
		if (size = 0) {
			Node addition = new Node(value);
			start = addition;
			end = addition;
		} else {
			Node addition = new Node(value);
			addition.setPrev(end);
			end.setNext(addition);
			end = addition;
		}
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
		return getNthNode(index).getData();
	}
	public Integer set(int index, Integer value) {
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
	
}
