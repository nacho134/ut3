/*package org.example;


import org.example.manyToMany.cuenta;
import org.example.manyToMany.moneda;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppManyToMany
{
    public static void main(String[] args) {
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session ss=sf.openSession();
        Transaction tr = ss.beginTransaction();
        List<cuenta> cuentas=new ArrayList<>();
        List<moneda> monedas=new ArrayList<>();
        cuenta c1 = new cuenta(1,"hola",null);
        //cuenta c2 = new cuenta(2,"tu abuelo");
        cuentas.add(c1);
        moneda m1 = new moneda(500,"dolar",null);
        moneda m2 = new moneda(200,"dolar",null);
        monedas.add(m2);
        m2.setCuentas(cuentas);
        ss.persist(m2);
        tr.commit();

    }
}
*/