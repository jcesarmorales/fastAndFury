package com.example.fastAndFury.domains;

public class CojineriaToyota implements ICojineria{

    private String no_Pieza;
    private String material;

    public CojineriaToyota() {
        this.no_Pieza = "ToyotaCoj";
        this.material = "tela";
    }

    @Override
    public String getInfoCojineria() {
        return "numero de pieza: "+this.no_Pieza+", material: "+this.material;
    }
}
