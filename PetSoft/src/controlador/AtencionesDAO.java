/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Clases.Atenciones;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Developer
 */
public class AtencionesDAO {
   private Session sesion;
    private Transaction tx;

    public void guardaAtencion(Atenciones atencion) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.save(atencion);
            sesion.flush();
            tx.commit();
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {
            sesion.close();
        }
      

    }
    public void modificarAtencion(Atenciones atencion) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.update(atencion);
            sesion.flush();
            tx.commit();
            
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {

            sesion.close();
        }

    }
    public void eliminarAtencion(Atenciones atencion) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.remove(atencion);
            sesion.flush();
            tx.commit();
            
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {

            sesion.close();
        }

    }
    
 
   


    

    private void iniciaOperacion() throws HibernateException
    {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = (Transaction) sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException, IllegalStateException
    {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }  
}
