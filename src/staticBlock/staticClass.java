package staticBlock;

public class staticClass {

	public static void main(String[] args) {
     System.out.println("Main block");
	}

	static {
		System.out.println("Static block"); // this code will print first then only the main block will be called
	}
}
