package tubespbo;

public class User {
     String username;
     String password;
    
    //konstruktor
    User(String username,String password){
       this.username = username;
       this.password = password;
              
    }
    //method
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

}
