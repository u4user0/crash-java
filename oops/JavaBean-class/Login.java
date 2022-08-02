public class Login {
        private String name, pass;
        Login(String name, String pass){
                //this.name=
                setName(name);
                //this.pass=
                setPass(pass);
        }
        public void setName(String name){
                this.name=name;
        }
        public String getName(){
                //System.out.println("Name: "+name);
                return name;
        }
        public void setPass(String pass){
                this.pass=pass;
        }
        public String getPass(){
                //System.out.println("Password: "+pass);
                return pass;
        }
}
