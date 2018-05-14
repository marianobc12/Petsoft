/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Clases.Mascotas;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Developer
 */
public class MascotasDAO {
    private Session sesion;
    private Transaction tx;

    public void guardaMascota(Mascotas mascota) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.save(mascota);
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
    public void modificarMascota(Mascotas mascota) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.update(mascota);
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
    public void eliminarMascota(Mascotas mascota) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.remove(mascota);
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
