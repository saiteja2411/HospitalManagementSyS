/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Doctor;
import com.model.InPatient;
import com.model.Patient;
import com.model.Room;
import com.util.HibernateUtil;
import java.text.SimpleDateFormat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author nitin
 */
public class InpatientDao {

    public void addInpatient(String patientName, int pAge, String gender, int pPhoneNumber, String pAddress, int doctors, String admitDate, String dischargeDate,int roomNum) {
        System.out.println("in addpatient");
        Session session = HibernateUtil.getSession();
        try {
            Transaction tx = session.beginTransaction();

            Doctor d1 = (Doctor) session.load(Doctor.class, doctors);
            Room r1 = (Room) session.load(Room.class, roomNum);

            Patient p1 = new Patient();
            InPatient p2 = new InPatient();
            //Room r1 = new Room();
            p2.setName(patientName);
            p2.setAge(pAge);
            p2.setGender(gender);
            p2.setPhoneNumber(pPhoneNumber);
            p2.setAddress(pAddress);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            p2.setAdmitDate(format.parse(admitDate));
            p2.setDischargeDate(format.parse(dischargeDate));
            //p2.setRoomNumber(roomNum);
            //r1.setRoomType(roomType);
            p2.setDoctor(d1);
            //p2.setPatient(p1);
            p2.setRoom(r1);

            //session.save(r1);
            //session.save(p1);
            session.save(p2);

            tx.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
// Actual contact insertion will happen at this step 
            session.close();
        }

    }

}//class
