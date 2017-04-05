/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;

/**
 *
 * @author Saiteja
 */
@Entity
@PrimaryKeyJoinColumn(name = "patientID")
public class InPatient extends Patient implements Serializable {

//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @JoinColumn(name="patientID")
//    @OneToOne
//    private Patient patient;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date admitDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dischargeDate;
    @OneToOne
    @JoinColumn(name = "roomID")
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    
    public Date getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Date admitDate) {
        this.admitDate = admitDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

}
