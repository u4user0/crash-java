//page: 32
public class overloadingVarArgsBoxingUnboxingEx {
	static void method(String a) {
		System.out.println("First name: "+a);
	}
	static void method(String a, String b) {
		System.out.println("First & middle name"+a+ " "+b);
	}
	static void method(String a, String b, String c) {
		System.out.println("Full name: "+ a + " "+b+" "+c);
	}
	static void show(String ... size) {
		for(String i : size)
		   System.out.print("Name: "+ i);
	}

	public static void main ( String[] args ) {
		method("umberala");
		method("umnerela","used","in rain");
		method("charged","atom");
		show("a4apple","b4boll","c4cat","d4dog","e4egg");
	}

}
