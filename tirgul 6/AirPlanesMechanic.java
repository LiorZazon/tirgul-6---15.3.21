package com.company;

public class AirPlanesMechanic extends Mechanic{

    protected int rank;

    @Override
    public void repair(){
        System.out.println("..repairing airplane");
    }

    public void checkEngine(){
        System.out.println("checking the engine");
    }
}
