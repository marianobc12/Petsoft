package controlador;

import Clases.Historias;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class HistoriaDAO {
     private Session sesion;
    private Transaction tx;

    public void guardaHistoria(Historias historias) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.save(historias);
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
    public void modificarHistoria(Historias historias) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.update(historias);
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
    public void eliminarHistoria(Historias historias) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.remove(historias);
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

