package com.example.fastAndFury.domains.abstractFactory;

import com.example.fastAndFury.domains.*;

public class ConcreteFactoryAutoMazda implements AutomovilAbstractFactory{
    @Override
    public IMotor crearMotor() {
        return new MotorMazda();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaMazda();
    }

    @Override
    public IChasis crearChasis() {
        return new ChasisMazda();
    }
}
