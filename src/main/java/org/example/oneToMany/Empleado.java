package org.example.oneToMany;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

//entidad
@Entity
@Table(name="empleados")
public class Empleado implements Serializable
{

    @Id//clave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column//columna
    private String nombre;
    @Column
    private int salario;
    @Column
    private int antig;

    @OneToMany(mappedBy = "empleados",cascade = CascadeType.PERSIST)
    private List<Banco> banco;


    public Empleado()
    {
    }

    public Empleado(String nombre, int salario, int antig,List<Banco> banco) {
        this.nombre = nombre;
        this.salario = salario;
        this.antig = antig;
        this.banco=banco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setAntig(int antig) {
        this.antig = antig;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public int getAntig() {
        return antig;
    }
    public List<Banco> getBanco(){return banco;}
    public void setBanco(List<Banco> banco){this.banco=banco;}

    @Override
    public String toString() {
        return "empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", antig=" + antig +
                '}';
    }
}
