class consOverload {

        consOverload() {

                System.out.println("class: consOverload Default cons">

        }

        consOverload(String a) {

                System.out.println("class: consOverload cons: "+a);

        }

        consOverload(String a, int b) {

                System.out.println("class: consOverload cons: " + a +>

        }

}

public class test {

        public static void main(String[] args) {

                consOverload a = new consOverload();

                consOverload b = new consOverload("2nd cons");

                consOverload c = new consOverload("3rd cons",3);

        }

}
