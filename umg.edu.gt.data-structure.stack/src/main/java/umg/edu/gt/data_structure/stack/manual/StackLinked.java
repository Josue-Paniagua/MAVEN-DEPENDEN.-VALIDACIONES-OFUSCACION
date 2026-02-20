package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

	private Node top; // tope de la pila

		public StackLinked() 
		{ this.top = null;
	}
	
	public void initStack(char value) {
		top = new Node(value, null, 0); 
	}

	public void push(char value ) {
		if(top == null) {
			top = new Node(value, null,0);
		}else {
			top = new Node(value, top, top.count);
		}
	}
	
	public int size() {
		if (top == null) {
	        return 0;
	    }
		
		return top.count;
	}

	public char pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
			
		}
		char value = top.value;
		top = top.next;
		return value;
	}

	public char peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack esta vacia");
		}
		return top.value;
	}
	public boolean isEmpty() {
		return top ==null;

}
	
	
	public int getSize() {
		
		if (top ==null) { 
			return 0;}
		
		return top.count;
		
	}
	
	public Node getNodeInit() 
	{
		
		if (top == null) return null;
		Node current = top; 
				while (current.next !=null) {
					
					current = current.next;
				}
				return current;
	}
	
	
	
}
