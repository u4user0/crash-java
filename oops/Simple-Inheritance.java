class A {
	A() {
		System.out.println("class: A called");
	}
}
class B extends A {
	B() {
		System.out.println("class: B called");
	}
}
class C {
	static int a = 12;
	static {
		System.out.println("static block: called");
	}
	C() {
		System.out.println("class: C called");
	}
}
public class inheritanceEx extends B {
	inheritanceEx() {
		System.out.println("class: test loaded");
	}
	static {
		inheritanceEx t = new inheritanceEx();
	}
	public static void main ( String[] args ) {
		System.out.println("im main method!..");
		System.out.println(C.a);
	}

}
