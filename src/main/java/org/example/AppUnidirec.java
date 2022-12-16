package org.example;

import org.example.unidirec.BancoUni;
import org.example.unidirec.cliente;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppUnidirec
{
    public static void main(String[] args)
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss= sf.openSession();
        Transaction tr=ss.beginTransaction();
        cliente c1 = new cliente("nacho","perez");
        BancoUni bancoUni = new BancoUni("sabadell",4567234,null);
        ss.persist(bancoUni);
        ss.persist(c1);
        tr.commit();
        ss.close();

    }

}
