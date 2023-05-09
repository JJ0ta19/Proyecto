package com.example.ejonespringboot.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Pagotarj")

public class PagoTarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    private String numeroSerie;
    private String tipoTarjeta;
    private String nombreDueño;
    private String fechaExpiracion;
    private String codigoSeguridad;

    public PagoTarjeta(Long id, String numeroSerie, String tipoTarjeta, String nombreDueño,
                   String fechaExpiracion, String codigoSeguridad) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.tipoTarjeta = tipoTarjeta;
        this.nombreDueño = nombreDueño;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;

    }

    public PagoTarjeta(){}

}
