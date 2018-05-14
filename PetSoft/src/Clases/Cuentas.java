/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "cuentas")
public class Cuentas implements Serializable{
    @Id
    @Column(name="Usuario")
    private String Usuario;
    @Column(name="Contraseña")
    private String Contraseña;
    @Column(name="Pregunta_sec")
    private String Pregunta;
    @Column(name="Resp_sec")
    private String Respuesta;

    public Cuentas() {
    }

    public Cuentas(String Usuario,String Contraseña,String Pregunta,String Respuesta){
        this.Usuario=Usuario;
        this.Contraseña=Contraseña;
        this.Pregunta=Pregunta;
        this.Respuesta=Respuesta;
    }
    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the Pregunta
     */
    public String getPregunta() {
        return Pregunta;
    }

    /**
     * @param Pregunta the Pregunta to set
     */
    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    /**
     * @return the Respuesta
     */
    public String getRespuesta() {
        return Respuesta;
    }

    /**
     * @param Respuesta the Respuesta to set
     */
    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }
    
    
}
