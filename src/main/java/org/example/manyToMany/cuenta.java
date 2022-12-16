package org.example.manyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="cuenta")
public class cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int dni;
    @Column
    private int iban;
    @Column
    private String nombre;

    @ManyToMany(cascade=CascadeType.PERSIST,mappedBy = "cuenta")
    private List<moneda> monedas;

    public cuenta(int iban, String nombre, List<moneda> monedas) {
        this.iban = iban;
        this.nombre = nombre;
        this.monedas=monedas;
    }

    public cuenta() {
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<moneda> getMonedas(){return monedas;}

    public void setMonedas(List<moneda> monedas) {this.monedas=monedas;}

    @Override
    public String toString() {
        return "cuenta{" +
                "dni=" + dni +
                ", iban=" + iban +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
