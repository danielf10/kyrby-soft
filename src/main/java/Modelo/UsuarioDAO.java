/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Mapeo.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author jonathan
 */
public class UsuarioDAO {
    //Atributo para una nueva sesion 
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public Usuario getUs(String usen) {
        Usuario user = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
            String hql = " from Usuario where idusuario = :usen";
            Query query = session.createQuery(hql);
            query.setParameter("usen", usen);
            user = (Usuario)query.uniqueResult();
            tx.commit();
           
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return user;
    }
    
    
    //public Usuario setCorreo(String nombre) {
    //}
    //public Usuario setContrasenia(String nombre) {
    //}
    public Usuario getCont(String contra) {
        Usuario user = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
            String hql = " from usuario where contrasenia = :contra";
            Query query = session.createQuery(hql);
            query.setParameter("contra", contra);
            user = (Usuario)query.uniqueResult();
            tx.commit();
           
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return user;
    }
    
    
 

}
