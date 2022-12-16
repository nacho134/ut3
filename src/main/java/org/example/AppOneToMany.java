package org.example;

import org.example.oneToMany.Banco;
import org.example.oneToMany.Empleado;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppOneToMany
{
    public static void main(String []args)
    {
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session ss=sf.openSession();
        Transaction tr = ss.beginTransaction();
        List<Banco> bancos = new ArrayList<>();
        Banco b1 = new Banco("santander",3,null);
        Banco b2 = new Banco("sabadell",4,null);
        bancos.add(b1);
        bancos.add(b2);

        Empleado e1 = new Empleado("nacho",2000,30,bancos);

        b1.setEmpleados(e1);
        b2.setEmpleados(e1);


        //Banco p = new Banco("bbva",3,e1);

        ss.persist(e1);

        tr.commit();


    }
}
