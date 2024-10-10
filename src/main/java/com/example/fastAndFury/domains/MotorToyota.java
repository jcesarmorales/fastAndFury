package com.example.fastAndFury.domains;

public class MotorToyota implements IMotor{
    private double potencia;
    private String tecnologia;
    private String no_pieza;

    public MotorToyota() {
        this.potencia = 380.5;
        this.tecnologia = "termico";
        this.no_pieza = "ToyotaMot";
    }

    @Override
    public String getInfoMotor() {
        return "potencia: "+this.potencia+" HP, tecnologia: "+this.tecnologia+", numero de pieza: "+this.no_pieza;
    }
}
