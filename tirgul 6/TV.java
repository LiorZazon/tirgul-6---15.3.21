package com.company;

public class TV extends ElectricDevice{

    protected double m_screen_size;

    public TV(float m_voltage, double m_screen_size) {
        super(m_voltage, false);
        this.m_screen_size = m_screen_size;
    }

    @Override
    public void useDevice(){
        System.out.println("Watching TV..");
    }
    public void fixDevice(){
        if (isFaulty == true){
            System.out.println("fixing TV...");
        }
        else {
            System.out.println("this TV is working properly");
        }

    }
}
