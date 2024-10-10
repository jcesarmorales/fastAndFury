package com.example.fastAndFury.domains;

public class CojineriaFord implements ICojineria{
    private String no_Pieza;
    private String material;

    public CojineriaFord() {
        this.no_Pieza = "FordCoj";
        this.material = "cuero";
    }

    @Override
    public String getInfoCojineria() {
        return "numero de pieza: "+this.no_Pieza+", material: "+this.material;
    }
}
