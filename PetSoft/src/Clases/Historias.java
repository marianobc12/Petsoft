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
@Table(name = "historias")
public class Historias implements Serializable{
    @Id
    @Column(name = "ID_historia")
    private int ID_historia;

    public Historias() {
    }

    
    
    public Historias(int ID_historia) {
        this.ID_historia=ID_historia;
    }

    
    
    /**
     * @return the ID_historia
     */
    public int getID_historia() {
        return ID_historia;
    }

    /**
     * @param ID_historia the ID_historia to set
     */
    public void setID_historia(int ID_historia) {
        this.ID_historia = ID_historia;
    }
}
