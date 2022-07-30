class A {
	public static void main ( String ...args ) {
		System.out.println("Main method of class: A called");
	}
}
class B {
	public static void main ( String[] args ) {
		System.out.println("Main method of class: B called");
	}
}
public class mainMethodDemo {

	public static void main ( String[] args ) {
		System.out.println("Diffrent ways to call main method");
		B.main(null);
		B.main(args);
		String[] array={"hey"};
		B.main(array);//by array
		A.main();//but variable length args is important (...)
                //VarArgs or variable length argument from JDK version: 1.5 
	}

}
