package org.example.bidirec;

import jakarta.persistence.*;
import org.example.unidirec.cliente;

@Entity
@Table(name="banco")
public class BancoBidirec
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//para crear el autonúmerico
    private int id;
    @Column
    private String nombre;
    @Column
    private int bic;

    @OneToOne(mappedBy = "bancoBidirec")
    private clientebidirec clientebidirecs;


      public BancoBidirec() {
    }

    public BancoBidirec(String nombre, int bic, clientebidirec clientebidirecs) {
        this.nombre = nombre;
        this.bic = bic;
        this.clientebidirecs=clientebidirecs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBic() {
        return bic;
    }

    public void setBic(int bic) {
        this.bic = bic;
    }

    public clientebidirec getEmpleado() {
        return clientebidirecs;
    }

    public void setEmpleados(clientebidirec clientebidirecs){this.clientebidirecs=clientebidirecs;}

    @Override
    public String toString() {
        return "banco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", bic=" + bic +
                '}';
    }

}
