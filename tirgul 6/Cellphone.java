package com.company;

public class Cellphone extends ElectricDevice{

    protected String m_brand;

    public Cellphone(float m_voltage, String m_brand) {
        super(m_voltage, true);
        this.m_brand = m_brand;
    }
    @Override
    public void useDevice(){
        System.out.println("talking on the phone..");
    }
    @Override
    public void fixDevice(){
        if (isFaulty == true){
            System.out.println("fixing cellphone");
        }
        else {
            System.out.println("this cellphone is working properly");
        }
    }
    //@Override
    //public void insertNewBatteries(){
      //cant do that this method is final
    //}
}
