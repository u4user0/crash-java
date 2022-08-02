class A {
        A method() {
                return this;
        }
        void show() {
                System.out.println("method: show, im running");
        }
        A disp() {
                System.out.println("method: disp, im running");
                return this;
        }
        void run() {
                System.out.println("method: run, im running");
        }
}
public class covarientReturnType {

        public static void main ( String[] args ) {
                A a = new A();
                a.show();
                a.disp();
                A b = new A();
                b.method().disp().run();

        }

}
