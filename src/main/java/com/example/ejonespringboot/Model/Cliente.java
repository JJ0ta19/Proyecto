package com.example.ejonespringboot.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String identifiacion;
    private String correo;
    private String ciudad;

    public Cliente(Long id, String nombre, String apellido, String telefono,
                   String identifiacion, String correo, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.identifiacion = identifiacion;
        this.correo = correo;
        this.ciudad = ciudad;
    }

    public Cliente(){}

}
