package com.example.lab2_20210740.entity;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="auto")
public class Auto {

    private Integer idauto;
    private String modelo;
    private String color;
    private Integer kilomeraje;
    private Double costo_por_día;
    @ManyToOne
    @JoinColumn(name = "sede_idsede")
    private Sede sede;
    @Id
    private Long id;

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
