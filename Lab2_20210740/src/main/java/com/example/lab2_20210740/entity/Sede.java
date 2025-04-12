package com.example.lab2_20210740.entity;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table(name="sede")
public class Sede {
    @Id
    @Column(name="idsede")
    private String idsede;
    private String distrito;
    private String direccion;

}
