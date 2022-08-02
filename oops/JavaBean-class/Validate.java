public class Validate {
        public static String validate(Login login){
        if(login.getName().equals("admin") && login.getPass().equals("admin"))
                return "valid";
        else
                return "invalid";
        }
}
