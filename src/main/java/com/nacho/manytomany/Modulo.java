package com.nacho.manytomany;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="modulos")
public class Modulo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre")
    private String nom;
    @Column
    private int horas;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name="modulo_estudiante",
    joinColumns = {@JoinColumn(name="FK_modulo",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name="FK_estudiante",referencedColumnName = "id")})
    private List<Estudiante> estudiantes;

    public Modulo() {
    }

    public Modulo(String nom, int horas, List<Estudiante> estudiantes) {
        this.nom = nom;
        this.horas = horas;
        this.estudiantes = estudiantes;
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

    public int getHoras() {
        return horas;
    }

    public void setHoras(int salario) {
        this.horas = salario;
    }

    public List<Estudiante> getAlumnos() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salario=" + horas +
                ", estudiantes =" + estudiantes +
                '}';
    }
}
