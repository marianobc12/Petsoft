/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Pantallas.*;
import Clases.Cuentas;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

        

public class CuentasDAO {
      
    private Session sesion;
    private Transaction tx;
    
    
    public void ConectarBD (){
        this.iniciaOperacion();
        sesion.close();
    }
    public void guardaAlumno(Cuentas cuenta) throws HibernateException
    {

        
        try
        {
            this.iniciaOperacion();
            sesion.save(cuenta);
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
    public void modificarAlumno(Cuentas cuenta) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.update(cuenta);
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
    public void eliminarAlumno(Cuentas cuenta) throws HibernateException
    {


        try
        {
            this.iniciaOperacion();
            sesion.remove(cuenta);
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
  /* public void VerificarCuenta(String Usuario,String Contraseña) throws HibernateException
    {

        try
        {    
           
            this.iniciaOperacion();
            Cuentas cuentas = (Cuentas) sesion.createQuery("SELECT c FROM Cuentas c WHERE Usuario='"+Usuario+"'" ).uniqueResult();
            if (cuentas==null) {
                 JOptionPane.showMessageDialog(null,"Usuario Incorrecto","Aviso", ERROR_MESSAGE);
            }else{
                if (cuentas.getContraseña().equals(Contraseña)) {
                   
                }else{
                    JOptionPane.showMessageDialog(null,"Contraseña Incorrecto","Aviso", ERROR_MESSAGE);
                }
            }
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {
            sesion.close();
        }
      

    }*/
    

    public void iniciaOperacion() throws HibernateException
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
