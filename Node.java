public class Node {
	private Integer data;
	private Node next, prev;

	public Node(Node prev-val, int value, Node next-val) {
		data = value;
		prev = prev-val;
		next = next-val;
	}

	public Node next() {
		return next;
	}
	public Node prev() {
		return prev;
	}
	public void setNext(Node other) {
		next = other;
	}
	public void setPrev(Node other) {
		prev = other;
	}
	public Integer getData() {
		return data;
	}
	public Integer setData(Integer i) {
		data = i;
	}
	public String toString() {
		return "" + data;
	}
}
