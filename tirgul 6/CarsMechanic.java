package com.company;

import java.time.LocalDateTime;

public class CarsMechanic extends Mechanic{

    protected String[] car_types_i_can_repair;

    @Override
    public void repair()
    {
        System.out.println("..repairing car");
    }
    public void replaceWheel(){
        System.out.println("...replacing the damaged wheel");
    }
}
