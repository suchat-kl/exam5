
public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam5 ex = new Exam5();
		int a = 8, b = 10;
		System.out.println("Not Return value");
		ex.notReturnValue(a, b);
		System.out.println("Return value");
		System.out.println(" " + a + " + " + b + " = " + ex.returnValue(a, b));
	}

	private int returnValue(int a, int b) {
		return (a + b);
	}

	private void notReturnValue(int a, int b) {
		System.out.println(" " + a + " + " + b + " = " + (a + b));
	}
}
