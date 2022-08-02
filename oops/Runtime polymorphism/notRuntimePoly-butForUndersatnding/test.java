class A {
        A() {
                this(97);
                System.out.println("class: A default cons ");
        }
        A(int i ) {System.out.println("class: A para "+i);}
}

class B extends A {
        B() {
//              super(6);
                this("....");
                System.out.println("class: B default cons ");
        }
        B(String x) {
                System.out.println("class: B String para  "+x+" cons ");
        }
}

public class test extends B {
        test() {
                System.out.println("lass: test default cons");
        }
        test(int y) {
                System.out.println("class test: para cons  "+y);
        }
        public static void main ( String[] args ) {
//              new test();
                new test(5);
        }

}
