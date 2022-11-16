package com.nacho;

import com.nacho.bidirec.Empleado;
import com.nacho.bidirec.Usuario;
import com.nacho.onetomany.Alumno;
import com.nacho.onetomany.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppOneToMany {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();
        // el propietario de la relación es la parte de Many: alumno
        Alumno a1 = new Alumno("Pepe",29,null);
        Alumno a2 = new Alumno("Juan",26,null);
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(a1); alumnos.add(a2);
        Profesor p = new Profesor("Alfredo",4500,alumnos);
        a2.setProfesor(p);
        a1.setProfesor(p);
        //alumnos.get(0).setProfesor(p);
        ss.persist(p);
        t.commit();
    }
}
