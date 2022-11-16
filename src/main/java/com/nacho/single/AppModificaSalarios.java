package com.nacho.single;

import com.nacho.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class AppModificaSalarios
{
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        //obtengo el primer el empleado
       Empleado nacho= session.get(Empleado.class,1);
       //obtengo el segundo empleado
       Empleado nuno= session.get(Empleado.class,2);
        System.out.println(nacho);
        System.out.println(nuno);
        //resto 1000 euros
        nacho.setSalario(nacho.getSalario()-1000);
        //añado 1000 euros
        nuno.setSalario((nacho.getSalario()+1000));
        //no ncesito hacer persist porque la obtención ya la deja en el area de persistencia
        tr.commit();
        session.close();
    }




}
