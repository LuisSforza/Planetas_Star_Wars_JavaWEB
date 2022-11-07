/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

/**
 *
 * @author Luis CR
 */
public class pruebas {

    public static void main(String[] args) {
        UsuarioDAO user = new UsuarioDAO();
        if(user.validacionUser("LUMA99", "1234")){
            System.out.println("Pass");
        }else{
            System.out.println("No pasas");
        }
    }
    
}
