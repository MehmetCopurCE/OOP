
public class Messages {

	public static void main(String[] args) {

		Thought t = new Thought();
		Advice a = new Advice();
		
		t.message();
		a.message();   // overriding :A child class can override the definition of an inherited method in favor of its own
		               //The new method must have the same signature as the parent's method, but can have a different body

	}

}
