package umg.edu.gt.data_structure.stack.manual;

public class Node {
	public char value;
	Node next;
	int count;

	Node(char value, Node next, int count) {
		this.value = value;
		this.next = next;
		this.count = count + 1;
	}
public char getValue() {
	return value;
}
}
