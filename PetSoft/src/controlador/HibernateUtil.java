/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

/**
 *
 * @author Laura
 */


public class HibernateUtil
{
      private static final SessionFactory sessionFactory;   
      private static final Configuration cfg;
    static 
    { 
        try 
        { 
            cfg = new Configuration();
            sessionFactory = cfg.configure().buildSessionFactory(); 
        } catch (HibernateException he) 
        { 
           System.err.println("Ocurrió un error en la inicialización de la SessionFactory: " + he); 
           throw new ExceptionInInitializerError(he); 
        } 
    }  

    public static SessionFactory getSessionFactory() 
    { 
        return sessionFactory; 
    } 
}