package com.example.fastAndFury.domains;

import java.time.LocalDate;

public class Vehiculo {
    private String id;
    private LocalDate fecha;
    private String color;
    private IChasis  descripcion_chasis;
    private IMotor dercripcion_Motor;
    private ICojineria descripcion_cojineria;

    public Vehiculo(String id, LocalDate fecha, String color, IChasis descripcion_chasis, IMotor dercripcion_Motor, ICojineria descripcion_cojineria) {
        this.id = id;
        this.fecha = fecha;
        this.color = color;
        this.descripcion_chasis = descripcion_chasis;
        this.dercripcion_Motor = dercripcion_Motor;
        this.descripcion_cojineria = descripcion_cojineria;
    }

    public String getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getColor() {
        return color;
    }

    public IChasis getDescripcion_chasis() {
        return descripcion_chasis;
    }

    public IMotor getDercripcion_Motor() {
        return dercripcion_Motor;
    }

    public ICojineria getDescripcion_cojineria() {
        return descripcion_cojineria;
    }
}
