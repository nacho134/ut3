package com.nacho.unidirec;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="deportistas")
public class Deportista implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String nombre;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_deporte",referencedColumnName = "id")
    private Deporte deporte;

    public Deportista() {
    }

    public Deportista(String nombre, Deporte deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
    }

    public int getId() {
        return id;
    }

 /*   public void setId(int id) {
        this.id = id;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", deporte=" + deporte +
                '}';
    }
}