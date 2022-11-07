/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import configuracion.conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Planeta;
import modelo.Usuario;

/**
 *
 * @author Luis CR
 */
public class PlanetaDAO implements CRUD {
    conexion conexionBD = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        ArrayList<Planeta>list=new ArrayList<>();
        String sql ="SELECT * FROM `planetas` ORDER BY `nombre` ASC";

        try{
             con = conexionBD.getConexion();

             ps = con.prepareStatement(sql);

             rs = ps.executeQuery();

             while(rs.next()){
                 Planeta planeta = new Planeta();
                 planeta.setId(rs.getInt("id"));
                 planeta.setName(rs.getString("nombre"));
                 planeta.setPath(rs.getString("imagen_Planeta"));

                 list.add(planeta);
             }
        }catch(Exception e){

        }
        return list;
    }

    @Override
    public Usuario list(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validacionUser(String user, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
