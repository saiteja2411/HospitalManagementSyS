/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Doctor;
import com.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Saiteja
 */
public class DoctorDao {
    
    Session session=null;
    public void persistDoctor(Doctor doc){
        System.out.println("com.dao.DoctorDao.persistDoctor()");
        try{
            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.save(doc);
            System.out.println("com.dao.DoctorDao.persistDoctor()");
            session.getTransaction().commit();
        }catch(Exception e){
            e.getStackTrace();
        }finally{
            session.close();
        }
    }
    
}
