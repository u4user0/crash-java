class Base {
/*
lecture: 89
Example of RunTime Polymorphism which is also called
Dynamic Binding or Dynamic Method Dispatcher.
Copy Page number: 35. 1 aug 2022 time= 19:10
*/
	String name = "class: Base";
	Base() {
		System.out.println("Base constructor");
	}
	Base(String x) {
		System.out.println("Who give me parameters: "+x);
	}
	void show() {
		System.out.println("Method of class: Base");
	}
	void baseM() {
		System.out.println("Method of class: baseM");
	}
	void norM() {
		System.out.println("Normal method of class: Base");
	}
	void run() {
		System.out.println("run method");
	}

}
public class child extends Base {
//error coming!.must ask question
//		this();//super();.nonBase();
//this is working in constructor but not inside method
//not from below but above code in commented line
	String name = "class: test";
	child() {
		this.run();
//		this("qwerty");
		System.out.println("Child constructor");
	}
	child(String x) {
		this();
		System.out.println("Keyboard type: "+x);
	}
	void show() {;
		super.norM();
		this.norM1();
		System.out.println("Method of class: test");
	}
	void norM1() {
		System.out.println("Normal method of class: child");
	}
	void run() {
		System.out.println("run method");
	}
	public static void main (String[] args) {
		Base a = new child("not qwerty");
		a.show();
		a.baseM();
		Base b = new child();
		System.out.println(b.name);
	}
}
