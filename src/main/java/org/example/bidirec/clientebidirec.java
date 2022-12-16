package org.example.bidirec;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="clientes")
public class clientebidirec implements Serializable
{
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_BANCOBIDIREC",referencedColumnName = "id")
    private BancoBidirec bancoBidirec;

    public clientebidirec() {
    }

    public clientebidirec(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}