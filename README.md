Static contexts

Lets take an example of real lifecase scenario In the Banking Application the accountBalance, withDraw() and checkBalance() are different for each customers, hence accountBalance, withDraw() and checkBalance() are non-static. But when the customer takes loan the interest and calculateInterest() are same among customers in a bank, hence interest and calculateInterest() are static.



static block


package staticBlock;

public class staticClass {

	public static void main(String[] args) {

	}

	static {
		
	}
}

anything mentioned in the static (here i.e static {}) whatever placed in the static block of code will be executed by the jvm when the class (here 'staticClass') will be loaded, even before the main class is called. The static block will be called only once when the class is loaded.
