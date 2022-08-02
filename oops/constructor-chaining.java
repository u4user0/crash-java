public class test {
	test () {
		System.out.println("Default constructor");
		new test(12);
	}
	test( float f ) {
		System.out.println("Constructor: float: "+f);
	}
	test ( String s ) {
		System.out.println("Constructor: String arg: "+s);
		new test(33.3f);
	}
	test ( int i ) {
		new test("called");
		System.out.println("Constructor: int arg: "+i);
	}
	public static void main ( String[] args ) {
		test t = new test();
	}

}
