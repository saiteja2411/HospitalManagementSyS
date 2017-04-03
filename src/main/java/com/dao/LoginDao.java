/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.AdminLogin;
import com.model.Doctor;
import com.model.Patient;
import com.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Saiteja
 */
public class LoginDao {

    public String checkUser(int user,String pass) {
        int count=0;
        AdminLogin al=null;
        Session session=HibernateUtil.getSession();
        session.beginTransaction();
//        Doctor d = new Doctor();
//        d.setName("tom");
//        
//        Patient p= new Patient();
//        Patient p2= new Patient();
//        p.setName("sai");p.setAge(23);p.setPhoneNumber(98765432);p.setDoctor(d);
//        p2.setName("nitin");p.setAge(23);p2.setPhoneNumber(98765432);p2.setDoctor(d);
//        
//        
//        session.save(p);
//        session.save(p2);
        
        Query query=session.createQuery("from AdminLogin where id="+user);
        List l = query.list();
        for(Object s : l){
            count++;
            al= (AdminLogin)s;
        }
        
        session.getTransaction().commit();
        session.close();
        if(count==0)
            return "wrongUser";
        else{
            if(al.getPassword().equals(pass))
                return "correctPassword";
            else
                return "wrongPassword";
        }
        
    }
}
