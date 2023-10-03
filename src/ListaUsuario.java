
import Clases.Usuario;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erikv
 */
public class ListaUsuario {
    private static Vector<Usuario> datos = new Vector<Usuario>();
    public static void agregar(Usuario obj){
        datos.addElement(obj);
    }
    public static void eliminar(int position){
        datos.remove(position);
    }
    public static Vector mostrar(){
        return datos;
    }
    
}
