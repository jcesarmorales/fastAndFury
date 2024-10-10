package com.example.fastAndFury.domains;

public class MotorMazda implements IMotor{
    private double potencia;
    private String tecnologia;
    private String no_pieza;

    public MotorMazda() {
        this.potencia = 290.0;
        this.tecnologia = "electrico";
        this.no_pieza = "MazdaMot";
    }

    @Override
    public String getInfoMotor() {
        return "potencia: "+this.potencia+" HP, tecnologia: "+this.tecnologia+", numero de pieza: "+this.no_pieza;
    }
}
