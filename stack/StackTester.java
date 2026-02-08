package stack;

public class StackTester {

	public static void main(String[] args) {
		Stack s = new StackImpl();
		runTests(s);

	}
	
	public static void runTests(Stack stack) {
		stack.push("smells");
		stack.push("like");
		stack.push("teen");
		stack.push("spirit");
		
		stack.display();
	}

}
