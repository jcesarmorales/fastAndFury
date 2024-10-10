package com.example.fastAndFury.domains.abstractFactory;

import com.example.fastAndFury.domains.*;

public class ConcreteFactoryAutoToyota implements AutomovilAbstractFactory{
    @Override
    public IChasis crearChasis() {
        return new ChasisToyota();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaToyota();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorToyota();
    }
}
