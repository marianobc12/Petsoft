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

@Entity
@Table(name = "atenciones")
public class Atenciones implements Serializable{
    @Id
    @Column(name = "ID_atenciones")
    private int ID_atenciones;
    @Column(name = "ID_mascota")
    private int ID_mascota;
    @Column(name = "Fecha_atencion")
    private String Fecha_atencion;
    @Column(name = "Hora_atencion")
    private String Hora_atencion;
    @Column(name = "Diagnostico")
    private String Diagnostico;
    @Column(name = "Observaciones")
    private String Observaciones;

    public Atenciones() {
    }
    
    
    public Atenciones(int ID_mascota,String Fecha_atencion,String Hora_atencion,String Diagnostico,String Observaciones){
        this.ID_mascota=ID_mascota;
        this.Fecha_atencion=Fecha_atencion;
        this.Hora_atencion=Hora_atencion;
        this.Diagnostico=Diagnostico;
        this.Observaciones=Observaciones;
    }

    /**
     * @return the ID_atenciones
     */
    public int getID_atenciones() {
        return ID_atenciones;
    }

    /**
     * @param ID_atenciones the ID_atenciones to set
     */
    public void setID_atenciones(int ID_atenciones) {
        this.ID_atenciones = ID_atenciones;
    }

    /**
     * @return the ID_mascota
     */
    public int getID_mascota() {
        return ID_mascota;
    }

    /**
     * @param ID_mascota the ID_mascota to set
     */
    public void setID_mascota(int ID_mascota) {
        this.ID_mascota = ID_mascota;
    }

    /**
     * @return the Fecha_atencion
     */
    public String getFecha_atencion() {
        return Fecha_atencion;
    }

    /**
     * @param Fecha_atencion the Fecha_atencion to set
     */
    public void setFecha_atencion(String Fecha_atencion) {
        this.Fecha_atencion = Fecha_atencion;
    }

    /**
     * @return the Hora_atencion
     */
    public String getHora_atencion() {
        return Hora_atencion;
    }

    /**
     * @param Hora_atencion the Hora_atencion to set
     */
    public void setHora_atencion(String Hora_atencion) {
        this.Hora_atencion = Hora_atencion;
    }

    /**
     * @return the Diagnostico
     */
    public String getDiagnostico() {
        return Diagnostico;
    }

    /**
     * @param Diagnostico the Diagnostico to set
     */
    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    /**
     * @return the Observaciones
     */
    public String getObservaciones() {
        return Observaciones;
    }

    /**
     * @param Observaciones the Observaciones to set
     */
    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    
}
