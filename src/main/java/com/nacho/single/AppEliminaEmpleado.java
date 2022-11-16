package com.nacho.single;

import com.nacho.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class AppEliminaEmpleado
{
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Empleado emp = session.get(Empleado.class,353);
        System.out.println(emp);

session.remove(emp);

        //no ncesito hacer persist porque la obtención ya la deja en el area de persistencia
        tr.commit();
        session.close();
    }




}
