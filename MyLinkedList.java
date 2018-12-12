public class MyLinkedList {
	private int size;
	private Node start, end;
	
	public MyLinkedList(int length, Node init, Node term) {
		size = length;
		start = init;
		end = term;
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
		String result = "{ "
		while (current.next != null) {
			result += current + ", ";
			current = current.next;
		}
		result += end + "}"
	}
}
