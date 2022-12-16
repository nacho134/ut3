package org.example;

import org.example.consultas.coche;
import org.example.consultas.propietario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String []args)
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss= sf.openSession();
        Transaction tr = ss.beginTransaction();
        coche c1 = new coche("clio","renault",null);
        List<propietario> propietarios = new ArrayList<propietario>();
        propietario p1= new propietario("nacho","perez",null);
        propietario p2= new propietario("lucas","sanchez",null);
        propietarios.add(p1);
        propietarios.add(p2);

        p1.setCoche(c1);
        c1.setPropietario(propietarios);

        ss.persist(p1);
        ss.persist(p2);
        tr.commit();
    }



}
