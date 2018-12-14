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
		Node addition = new Node(end, value, null);
		end = Node(end.prev, end.data, addition);
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
}
