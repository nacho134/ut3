package org.example.consultas;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="coches")

public class coche
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String modelo;
    @Column
    private String marca;
    @OneToMany(mappedBy = "coche",cascade = CascadeType.PERSIST)
    private List<propietario> propietario;

    public coche() {
    }

    public coche(String modelo, String marca,List<propietario> propietario) {
        this.modelo = modelo;
        this.marca = marca;
        this.propietario=propietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPropietario(List<propietario> propietario) {
        this.propietario = propietario;
    }
    public List<propietario> getPropietario(){return propietario;}

    @Override
    public String toString() {
        return "coche{" +
                "matricula=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
