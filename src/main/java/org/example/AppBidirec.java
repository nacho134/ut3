package org.example;


import org.example.bidirec.BancoBidirec;
import org.example.bidirec.clientebidirec;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppBidirec
{
    public static void main(String[] args)
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss= sf.openSession();
        Transaction tr=ss.beginTransaction();
        clientebidirec c1 = new clientebidirec("nacho","perez");
        BancoBidirec bancoUni = new BancoBidirec("sabadell",4567234,null);
        ss.persist(bancoUni);
        ss.persist(c1);
        tr.commit();
        ss.close();

    }

}
