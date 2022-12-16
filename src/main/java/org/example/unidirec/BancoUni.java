package org.example.unidirec;

import jakarta.persistence.*;
import org.example.oneToMany.Empleado;

@Entity
@Table(name="banco")
public class BancoUni
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//para crear el autonúmerico
    private int id;
    @Column
    private String nombre;
    @Column
    private int bic;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_CLIENTEUNI",referencedColumnName = "id")
    private cliente clientes;

      public BancoUni() {
    }

    public BancoUni(String nombre, int bic, cliente clientes) {
        this.nombre = nombre;
        this.bic = bic;
        this.clientes=clientes;
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

    public cliente getEmpleado() {
        return clientes;
    }

    public void setEmpleados(cliente clientes){this.clientes=clientes;}

    @Override
    public String toString() {
        return "banco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", bic=" + bic +
                '}';
    }

}
