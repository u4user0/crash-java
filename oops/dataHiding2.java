class A {
	String name = "im class: A";
	static {
		System.out.println("class A: loaded");
	}
}
class B extends A {
	String name = "im class: B";
	static {
		System.out.println("class B: loaded");
	}

}
public class dataHiding extends B {
	String name = "im class: dataHiding";
	static {
		System.out.println("class dataHiding: loaded");
	}
	public static void main ( String[] args ) {
		A a = new dataHiding();
		System.out.println("A a: "+a.name);
		B b = new dataHiding();
		System.out.println("B b: "+b.name);
		dataHiding c = new dataHiding();
		System.out.println("dataHiding c: "+c.name);
		System.out.println("using className.name(D.name): "+D.name);
	}

}
class C {
	static {
		System.out.println("class C: loaded");
	}
	static String name = "im class: C";
}
class D extends C {
	static String name = "im class: D";
	static {
		System.out.println("class D: loaded");
	}
}
