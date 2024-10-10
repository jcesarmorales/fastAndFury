package com.example.fastAndFury.domains.abstractFactory;

import com.example.fastAndFury.domains.IChasis;
import com.example.fastAndFury.domains.ICojineria;
import com.example.fastAndFury.domains.IMotor;

public interface AutomovilAbstractFactory {
    IChasis crearChasis();
    ICojineria crearCojineria();
    IMotor crearMotor();
}
