/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa07;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author minio
 */
public class DAOProducto implements IDAOGeneral<Producto, Long> {

    @Override
    public Producto create(Producto p) {
        Session session= HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        session.save(p);
        t.commit();
        session.close();
        return p;
    }

    @Override
    public boolean delete(Long id) {
        boolean res;
        try (Session session = HibernateUtil.getSession()) {
            Transaction t =session.beginTransaction();
            res = false;
            Producto producto=findById(id);
            if (producto==null)
                res= false;
            else{
                session.delete(producto);
                res= true;
            }   t.commit();
        }
        return res;
        
    }

    @Override
    public Producto update(Producto p, Long id) {
        Producto producto;
        try (Session session = HibernateUtil.getSession()) {
            Transaction t =session.beginTransaction();
            producto = findById(id);
            if (producto==null)
                session.update(producto);
            t.commit();  
        }
        return producto;
        
    }

    @Override
    public List<Producto> findAll() {
        Session session= HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        List<Producto> isProd=
                session.createQuery("from Producto",Producto.class).list();
        t.commit();
        session.close();
        return isProd;
    }

    @Override
    public Producto findById(Long id) {
        Session session= HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        Producto p=session.get(Producto.class, id);
        t.commit();
        session.close();
        return p;
    }
    
}
