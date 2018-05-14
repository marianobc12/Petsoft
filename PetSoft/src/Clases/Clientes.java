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
@Table(name = "cliente")
public class Clientes implements Serializable{
    @Id
    @Column(name = "Dni")
    private int Dni;
    @Column(name = "NomyApe")
    private String NomyApe;
    @Column(name = "Fecha_nac")
    private String Fecha_nac;
    @Column(name = "Ciudad")
    private String Ciudad;
    @Column(name = "Domicilio")
    private String Domicilio;
    @Column(name = "Telefono")
    private String Telefono;

    public Clientes() {
    }

    public Clientes(int Dni,String NomyApe,String Fecha_nac,String Ciudad,String Domicilio,String Telefono){
        this.Dni=Dni;
        this.NomyApe=NomyApe;
        this.Fecha_nac=Fecha_nac;
        this.Ciudad=Ciudad;
        this.Domicilio=Domicilio;
        this.Telefono=Telefono;
        
    }

    /**
     * @return the Dni
     */
    public int getDni() {
        return Dni;
    }

    /**
     * @param Dni the Dni to set
     */
    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    /**
     * @return the NomyApe
     */
    public String getNomyApe() {
        return NomyApe;
    }

    /**
     * @param NomyApe the NomyApe to set
     */
    public void setNomyApe(String NomyApe) {
        this.NomyApe = NomyApe;
    }

    /**
     * @return the Fecha_nac
     */
    public String getFecha_nac() {
        return Fecha_nac;
    }

    /**
     * @param Fecha_nac the Fecha_nac to set
     */
    public void setFecha_nac(String Fecha_nac) {
        this.Fecha_nac = Fecha_nac;
    }

    /**
     * @return the Ciudad
     */
    public String getCiudad() {
        return Ciudad;
    }

    /**
     * @param Ciudad the Ciudad to set
     */
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    /**
     * @return the Domicilio
     */
    public String getDomicilio() {
        return Domicilio;
    }

    /**
     * @param Domicilio the Domicilio to set
     */
    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
}