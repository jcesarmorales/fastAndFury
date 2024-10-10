package com.example.fastAndFury.domains.simpleFactory;

import com.example.fastAndFury.domains.abstractFactory.AutomovilAbstractFactory;
import com.example.fastAndFury.domains.abstractFactory.ConcreteFactoryAutoFord;
import com.example.fastAndFury.domains.abstractFactory.ConcreteFactoryAutoMazda;
import com.example.fastAndFury.domains.abstractFactory.ConcreteFactoryAutoToyota;

public class SimpleFactoryAutomovil {

    public static AutomovilAbstractFactory crearFabrica(String marca){
        switch (marca) {
            case "ford":
                return new ConcreteFactoryAutoFord();
            case "mazda":
                return new ConcreteFactoryAutoMazda();
            default: return new ConcreteFactoryAutoToyota();

        }
    }
}
