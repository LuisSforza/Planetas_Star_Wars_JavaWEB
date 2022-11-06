
package modelo;
    
public class Usuario {
    
    public String user, name, password;

    public Usuario(){    
    }
    public Usuario(String user, String name, String password){  
        this.name = name;
        this.user=user;
        this.password = password;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
