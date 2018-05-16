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
@Table(name = "mascotas")
public class Mascotas implements Serializable{
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "Dni")
    private int Dni;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Especie")
    private String Especie;
    @Column(name = "Raza")
    private String Raza;
    @Column(name = "Sexo")
    private String Sexo;
    @Column(name = "Edad")
    private int Edad;

    public Mascotas() {
    }
    
    public Mascotas(int Dni,String Nombre,String Especie,String Raza,String Sexo,int Edad){
        this.Dni=Dni;
        this.Nombre=Nombre;
        this.Especie=Especie;
        this.Raza=Raza;
        this.Sexo=Sexo;
        this.Edad=Edad;
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
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Especie
     */
    public String getEspecie() {
        return Especie;
    }

    /**
     * @param Especie the Especie to set
     */
    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    /**
     * @return the Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     * @param Raza the Raza to set
     */
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the edad to set
     */
    public void setEdad(int Edad) {
        this.Edad =Edad;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    
    
}
