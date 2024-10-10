package com.example.fastAndFury.domains.abstractFactory;

import com.example.fastAndFury.domains.*;

public class ConcreteFactoryAutoFord implements AutomovilAbstractFactory{
    @Override
    public IChasis crearChasis() {
        return new ChasisFord();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaFord();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorFord();
    }
}
