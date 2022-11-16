package com.nacho;

import com.nacho.bidirec.Empleado;
import com.nacho.bidirec.Usuario;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppBidirec {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();

        Usuario u = new Usuario("emilioj","manin",null);
        Empleado e = new Empleado("Emilio José Pérez",4500,u);
        //u.setEmpleado(e);
        ss.persist(e);
        t.commit();
    }
}