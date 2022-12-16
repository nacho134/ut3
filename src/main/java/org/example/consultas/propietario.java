package org.example.consultas;

import jakarta.persistence.*;

@Entity
@Table(name="propietario")
public class propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int dni;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_coche",referencedColumnName = "id")
    private coche coche;

    public propietario() {
    }

    public propietario(String nombre, String apellido,coche coche) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.coche=coche;
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
    public void setCoche(coche coche){this.coche=coche;}
    public coche getCoche(){return coche;}

    @Override
    public String toString() {
        return "propietario{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
