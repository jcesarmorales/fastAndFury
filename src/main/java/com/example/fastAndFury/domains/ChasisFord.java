package com.example.fastAndFury.domains;

public class ChasisFord implements IChasis{
    private int no_ejes;
    private String no_Pieza;
    private String tipo_transmicion;

    public ChasisFord() {
        this.no_ejes = 4;
        this.no_Pieza = "FordA";
        this.tipo_transmicion = "automatica";
    }

    @Override
    public String getInfoChasis() {
        return "numero de ejes: "+this.no_ejes+", numero de pieza: "
                +this.no_Pieza+", tipo de Transmicion: "+this.tipo_transmicion;
    }
}
