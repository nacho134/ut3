package org.example.manyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="moneda")
public class moneda {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private  int id;
    @Column
    private int cantidad;
    @Column
    private String moneda;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name="cuenta_moneda",
            joinColumns={@JoinColumn(name="fk_moneda",referencedColumnName = "id")},
            inverseJoinColumns={@JoinColumn(name="fk_cuenta",referencedColumnName = "id")})
    private List<cuenta> cuentas;


    public moneda() {
    }

    public moneda(int cantidad, String moneda,List<cuenta> cuentas) {
        this.cantidad = cantidad;
        this.moneda = moneda;
        this.cuentas=cuentas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    public List<cuenta> getCuentas(){return cuentas;}
    public void setCuentas(List<cuenta> cuentas){this.cuentas=cuentas;}

    @Override
    public String toString() {
        return "moneda{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", moneda='" + moneda + '\'' +
                '}';
    }
}
