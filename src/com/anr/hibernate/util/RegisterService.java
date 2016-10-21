package com.anr.hibernate.util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anr.entities.ServiceRequest;
 

public class RegisterService {
     
public void register(Object user){
     Session session = HibernateUtil.openSession();  
     Transaction tx = null;
     try {
         tx = session.getTransaction();
         tx.begin();
         session.saveOrUpdate(user);  
         System.out.println("save success");
         tx.commit();
     } catch (Exception e) {
         if (tx != null) {
             tx.rollback();
         }
         e.printStackTrace();
     } finally {
         session.close();
     } 
  
}
}
