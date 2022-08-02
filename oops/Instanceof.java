//page: 36

class qlass {

}

class test extends qlass{

        public static void main(String[] args) {

        test a = new test();

        System.out.println("is class: test instance of qclass: "+ (a instanceof qlass));

        test a1 = new test();

        System.out.println("is class: qlass instance of test: "+ (a1 instanceof test));

        test b = null;

        System.out.println("(test b = null;) class: test instance of qclass: "+ (b instanceof qlass));

        qlass c = new qlass();

        System.out.println("is class: qlass instance of Object: "+ (b instanceof Object));

        qlass q1 = new test();

        System.out.println("qlass q1 = test(); : "+ (q1 instanceof qlass));

        System.out.println("qlass q1 = test(); : "+ (q1 instanceof test));

        System.out.println("qlass q1 = test(); is instance of Object: "+ (q1 instanceof Object));

        }

}
