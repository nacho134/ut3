package org.example.oneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="banco")
public class Banco
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//para crear el autonúmerico
    private int id;
    @Column
    private String nombre;
    @Column
    private int bic;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_empleado",referencedColumnName = "id")
    private Empleado empleados;

      public Banco() {
    }

    public Banco(String nombre, int bic,Empleado empleados) {
        this.nombre = nombre;
        this.bic = bic;
        this.empleados=empleados;
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

    public Empleado getEmpleado() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados){this.empleados=empleados;}

    @Override
    public String toString() {
        return "banco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", bic=" + bic +
                '}';
    }

}
