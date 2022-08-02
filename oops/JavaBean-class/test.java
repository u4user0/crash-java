//page: 33
public class test {

        public static void main ( String[] args ) {
                Login l = new Login("admin","admin");
//              l.getName();l.getPass();
                String check = Validate.validate(l);
                if(check.equals("valid"))
                        System.out.println("You are Admin");
                else
                        System.out.println("You are not Admin");
        }

}
