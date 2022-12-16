package org.example.consultas;

import org.example.HibernateUtil;
import org.example.consultas.coche;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;

public class consulta {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss= sf.openSession();
        String hql="FROM coche ";
        Query q= ss.createQuery(hql);
        Iterator<Integer> propietario=q.stream().iterator();
       /* while(propietario.hasNext())
        {
            System.out.println(propietario.next());
        }*/

        Query q2=ss.createQuery("from coche where modelo ='clio'");
        coche c4= (coche) q2.uniqueResult();
        System.out.println("El coche  es: "+c4);

        Query q3=ss.createQuery("from coche where modelo LIKE '%o'");
        coche c5= (coche) q3.uniqueResult();
        System.out.println(c5);
        Query q4=ss.createQuery("from propietario where nombre LIKE '%as'");
        Iterator<Integer> propietario2=q4.stream().iterator();
        while(propietario.hasNext())
        {
            System.out.println(propietario2.next());
        }

    }
}