package com.nacho.onetomany;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="alumnos")
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre")
    private String nom;
    @Column
    private int edad;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="FK_profesor",referencedColumnName = "id")
    private Profesor profesor;

    public Alumno() {
    }

    public Alumno(String nom, int edad, Profesor profesor) {
        this.nom = nom;
        this.edad = edad;
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", edad=" + edad +
                ", profesor=" + profesor +
                '}';
    }
}
