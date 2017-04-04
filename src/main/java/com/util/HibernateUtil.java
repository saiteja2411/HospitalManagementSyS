/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Saiteja
 */
public class HibernateUtil {
    static SessionFactory sessionFactory;
    static Session session;
    private HibernateUtil(){}
    public static Session getSession(){
            sessionFactory = new Configuration().configure().buildSessionFactory();
        
        return sessionFactory.openSession();
    }
}
