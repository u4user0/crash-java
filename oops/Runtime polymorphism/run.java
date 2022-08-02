class Base1 {
	Base1() {
		System.out.println("class: Base1 constructor");
	}
	Base1( String x ) {
		System.out.println("class: Base1 "+x+" constructor");
	}
	Base1( int y, String x) {
		this("yea runned");
		System.out.println("class: Base1 "+y+ " "+x+" constructor");
	}
}
public class run extends Base1 {
	run() {
		System.out.println("class: run constructor");
	}
	run(String x) {
		super(2,"runned");
		System.out.println("class: run para constructor is: "+x);
	}
	public static void main(String[] args) {
		new run();
		new run("im running 2 para super cons");
	}
}
