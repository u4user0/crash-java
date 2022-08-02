class grandparent {
	String name="";
}
class parent extends grandparent {
	String name="";
}
public class child extends parent {
	String name ="";
	void show(grandparent gp,child p) {
		System.out.println("child name: "+name);
		System.out.println("parent name: "+super.name);//with super
		System.out.println("grandparent name: "+gp.name);//without super
			System.out.println("child (without this) name: "+p.name);//without this
		
	}
	public static void main(String[] args) {
		child a = new child();
		a.show(a,a);
		//type casting ex
		grandparent b = new child();
		System.out.println(""+b.name);
	}
}
