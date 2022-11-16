package com.nacho.bidirec;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nomUsuario;
    @Column
    private String password;
    @OneToOne(mappedBy = "usuario")
    private Empleado empleado;
    public Usuario() {
    }

    public Usuario(String nomUsuario, String password, Empleado empleado) {
        this.nomUsuario = nomUsuario;
        this.password = password;
        this.empleado = empleado;
    }

    public int getId() {
        return id;
    }

/*    public void setId(int id) {
        this.id = id;
    }*/

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nomUsuario='" + nomUsuario + '\'' +
                ", password='" + password + '\'' +
                ", empleado=" + empleado +
                '}';
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


}