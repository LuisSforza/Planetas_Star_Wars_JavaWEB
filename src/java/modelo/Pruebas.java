/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


/**
 *
 * @author Luis CR
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Usuario> lista;
        conexion con = new conexion();
        lista = con.getAllUsuarios();
        
        for (int i=0; i<lista.size(); i++) {
            Usuario e = lista.get(i);
            System.out.print(e.name);
            System.out.print(e.user);
            System.out.print(e.password);
        }
    }
    
}
