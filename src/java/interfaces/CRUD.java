/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Usuario;

/**
 *
 * @author Luis CR
 */
public interface CRUD {
    public List listar();
    public Usuario list(String user);
    public boolean add(Usuario user);
    
}
