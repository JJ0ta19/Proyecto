package com.example.ejonespringboot.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Factura")

public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String datosMenu;
    private String metodoPago;
    private String direccion;
    private String precioFinal;

    public Factura(Long id, String nombre, String apellido, String telefono,
                   String datosMenu, String metodoPago, String direccion,String precioFinal) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.datosMenu = datosMenu;
        this.metodoPago = metodoPago;
        this.direccion = direccion;
        this.precioFinal= precioFinal;
    }

    public Factura(){}

}
