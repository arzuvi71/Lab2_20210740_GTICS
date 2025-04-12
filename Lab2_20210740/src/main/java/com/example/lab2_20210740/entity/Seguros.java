package com.example.lab2_20210740.entity;

public class Seguros {
    private Integer idseguro;

    public Integer getIdseguro() {
        return idseguro;
    }

    public void setIdseguro(Integer idseguro) {
        this.idseguro = idseguro;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getCobertura() {
        return cobertura;
    }

    public void setCobertura(Double cobertura) {
        this.cobertura = cobertura;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    private String empresa;
    private Double cobertura;
    private Double tarifa;
}
