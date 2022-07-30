
class A {
	static int a = 10;
	static {
		System.out.println("class: A is loaded by calling Static D.M");
	}
}
class B {
	static {
		System.out.println("class: B is loaded by extends Keyword");
	}
}
class C {
	static {
		System.out.println("class: C is Dynamically loaded");
	}
}
class D {
	D() {
		System.out.println("class: D is loaded and after loading constructor called");
	}
}
class E {
	E() {
		System.out.println("class: E is loaded by creating object without new,by Class.newInstance method");
	}
}
public class classLoading extends B {
	public static void main ( String[] args ) {
		System.out.println("main class: classLoading is already loaded");
		System.out.println(A.a);
		// Dynamically load a class 
		String name= "C";
		try {
		Class.forName(name);
		} catch ( ClassNotFoundException e ) {}
		D d = new D();

/*
		System.out.println("create object with class Class{}");
		//.....!NOT working!.....
		try {
		String EName ="E";
		Class c = Class.forName(EName);
		try {
			c.newInstance();
		} catch ( InstantiationException e) {
		} catch ( IllegalAccessException e ) {}
		} catch ( ClassNotFoundException e ) {}	*/
	}
}
