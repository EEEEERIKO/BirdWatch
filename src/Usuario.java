/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erikv
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private Integer ID;
    private String nombreUsuario;
    private String correoElectronico;
    private String password;
    


    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, Integer ID, String nombreUsuario,String correoElectronico ,String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ID = ID;
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public String correoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronic(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
