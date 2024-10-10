package com.example.fastAndFury.controller;


import com.example.fastAndFury.domains.IChasis;
import com.example.fastAndFury.domains.ICojineria;
import com.example.fastAndFury.domains.IMotor;
import com.example.fastAndFury.domains.Vehiculo;
import com.example.fastAndFury.domains.abstractFactory.AutomovilAbstractFactory;
import com.example.fastAndFury.domains.simpleFactory.SimpleFactoryAutomovil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/")
public class EnsambladoraController {
    @GetMapping("/{marca}")
    public Vehiculo ensamblarAutomovil(@PathVariable String marca){
        AutomovilAbstractFactory factory = SimpleFactoryAutomovil.crearFabrica(marca);
        IChasis chasis = factory.crearChasis();
        IMotor motor = factory.crearMotor();
        ICojineria cojineria = factory.crearCojineria();
        Vehiculo automovil = new Vehiculo("3245", LocalDate.now(),"rojo",chasis,motor,cojineria);
        return automovil;

    }
}
