package com.nacho;

import com.nacho.single.Empleado;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class AppSingle
{
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Empleado e3 = new Empleado("Nacho",5000);
        Empleado e4 = new Empleado("nuno",3000);
        session.persist(e3);session.persist(e4);

        tr.commit();
        session.close();
    }




}
