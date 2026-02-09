package stack;

public class StackTester {

	public static void main(String[] args) {
		Stack theStack = new StackImpl();
		runTests(theStack);

	}

	public static void runTests(Stack stack) {
		stack.setCapacity(6);

		stack.push("sam");
		stack.push("pam");
		stack.push("will");
		stack.push("jill");
		stack.push("herb");
		stack.push("barb");

		stack.display();

		System.out.println("Stack peek: " + stack.peek());
		System.out.println("Stack pop: " + stack.pop());
		System.out.println("Stack peek: " + stack.peek());

		stack.display();

		System.out.println("Full stack? " + stack.isFull());

		stack.push("ron");

		System.out.println("Full stack? " + stack.isFull());

		while (!stack.isEmpty())
			System.out.println(stack.pop() + "  exited the stack ");

		System.out.println("empty now?  " + stack.isEmpty());

	}

}
