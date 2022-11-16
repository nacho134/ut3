package com.nacho.single;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="empleados")
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name="nombre")
    private String nom;
    @Column
    private double salario;
    @Transient
    private String comentario;

    public Empleado() {
    }

    public Empleado(String nom, double salario) {
        this.nom = nom;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salario=" + salario +
                '}';
    }
}