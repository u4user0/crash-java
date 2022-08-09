class Parent {

        String name="class: Parent";

        static void run() {

                System.out.println("class: Parent, run();");

        }

        void show() {

                System.out.println("class: Parent, show();");

        }

}

class Child extends Parent {

        String name="class: Child";

        static void run() {

                System.out.println("class: Child, run();");

        }

        void show() {

                System.out.println("class: ,Child show();");

        }

}

public class test {

        public static void main ( String[] args ) {

                Child a = new Child();

                a.run();

                Parent b = new Child();

                b.run();

                a.show();

                b.show();

                System.out.println(a.name);

                System.out.println(b.name);

        }

}
