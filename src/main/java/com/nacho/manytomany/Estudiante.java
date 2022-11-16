package com.nacho.manytomany;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="estudiantes")
public class Estudiante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre")
    private String nom;
    @Column
    private int edad;
    @ManyToMany(cascade = CascadeType.PERSIST,mappedBy = "estudiantes")
    private List<Modulo> modulos;

    public Estudiante() {
    }

    public Estudiante(String nom, int edad, List<Modulo> modulos) {
        this.nom = nom;
        this.edad = edad;
        this.modulos = modulos;
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

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", edad=" + edad +
                ", módulos=" + modulos +
                '}';
    }
}
