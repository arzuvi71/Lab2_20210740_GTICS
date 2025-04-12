package com.example.lab2_20210740.entity;
import jakarta.persistence.*;

@Entity
@Table(name="auto")
public class Auto {

    private String modelo;
    private String color;
    private Integer kilomeraje;
    private Double costo_por_día;
    @ManyToOne
    @JoinColumn(name = "sede_idsede")
    private Sede sede;
    @Id
    private Long idauto;

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public void setId(Long id) {
        this.idauto = id;
    }

    public Long getId() {
        return idauto;
    }
}
