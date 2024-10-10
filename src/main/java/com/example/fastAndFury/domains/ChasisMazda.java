package com.example.fastAndFury.domains;

public class ChasisMazda implements IChasis {
    private int no_ejes;
    private String no_Pieza;
    private String tipo_transmicion;

    public ChasisMazda() {
        this.tipo_transmicion = "mecanica";
        this.no_Pieza = "Mazda34D";
        this.no_ejes = 4;
    }

    @Override
    public String getInfoChasis() {
        return "numero de ejes: "+this.no_ejes+", numero de pieza: "
                +this.no_Pieza+", tipo de Transmicion: "+this.tipo_transmicion;
    }
}
