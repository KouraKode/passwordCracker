public class User{
    private String pass;

    public User(String pass){
        this.setPass(pass);
    }

    public void setPass(String pass){
        this.pass = pass;
    }

    public boolean authentificate(String pwd){
        if(this.pass.equals(pwd))
            return true;
        return false;
    }
}