package com.example.fastAndFury.domains;

public class MotorFord implements IMotor{
    private double potencia;
    private String tecnologia;
    private String no_pieza;

    public MotorFord() {
        this.potencia = 340.0;
        this.tecnologia = "hibrido";
        this.no_pieza = "FordMot";
    }

    @Override
    public String getInfoMotor() {
        return "potencia: "+this.potencia+" HP, tecnologia: "+this.tecnologia+", numero de pieza: "+this.no_pieza;
    }
}
