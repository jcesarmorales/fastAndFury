package com.example.fastAndFury.domains;

public class CojineriaMazda implements ICojineria{

    private String no_Pieza;
    private String material;

    public CojineriaMazda() {
        this.no_Pieza = "MazdaCoj";
        this.material = "sintetico";
    }

    @Override
    public String getInfoCojineria() {
        return "numero de pieza: "+this.no_Pieza+", material: "+this.material;
    }
}
