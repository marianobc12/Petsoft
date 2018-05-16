/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Clases.Clientes;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Developer
 */
public class ClientesDAO {
      
    private Session sesion;
    private Transaction tx;

    public void guardaCliente(Clientes cliente) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.save(cliente);
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
    public void modificarCliente(Clientes cliente) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.update(cliente);
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
    public void eliminarCliente(Clientes cliente) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.remove(cliente);
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

