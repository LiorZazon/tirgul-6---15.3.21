package com.company;

public class PianoPlayer extends Player {


    @Override
    public void play() {
        System.out.println("Playing Bach..");
    }

    @Override
    public void compose() {
        System.out.println("composing piano melody...");
    }

    public void practice(){
        System.out.println("practice makes perfect!");
    }

    public void playJazz(){
        System.out.println("playing I Got Rhythm by George Gershwin");
    }
}
