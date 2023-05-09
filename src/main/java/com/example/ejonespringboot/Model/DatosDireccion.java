package com.example.ejonespringboot.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Datosdirec")

public class DatosDireccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    private String ciudad;
    private String barrio;
    private String direccion;


    public DatosDireccion(Long id, String ciudad, String barrio, String direccion) {
        this.id = id;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.direccion = direccion;

    }

    public DatosDireccion(){}


}
