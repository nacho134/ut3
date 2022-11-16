package com.nacho;

import com.nacho.manytomany.Estudiante;
import com.nacho.manytomany.Modulo;
import com.nacho.onetomany.Alumno;
import com.nacho.onetomany.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppManyToMany {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();
/*        Estudiante e1=new Estudiante("Javier Vicedo",21,null);
        Estudiante e2=new Estudiante("Nuño Navarro",21,null);
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e1);estudiantes.add(e2);
        Modulo m1=new Modulo("Acceso a datos",140,estudiantes);
        Modulo m2=new Modulo("Programación multimedia",140,estudiantes);
        List<Modulo> modulos = new ArrayList<>();
        modulos.add(m1);modulos.add(m2);
        e1.setModulos(modulos);
        e2.setModulos(modulos);
        ss.persist(m1);*/
        Modulo m3=new Modulo("Desarrollo de interfaes",100,null);
        List<Modulo> modulos = new ArrayList<Modulo>(); modulos.add(m3);
        Estudiante e3 = new Estudiante("Nacho Pérez",21,modulos);
        List<Estudiante> estudiantes=new ArrayList<>();
        estudiantes.add(e3);
        m3.setEstudiantes(estudiantes);
        ss.persist(e3);
        t.commit();

    }
}
