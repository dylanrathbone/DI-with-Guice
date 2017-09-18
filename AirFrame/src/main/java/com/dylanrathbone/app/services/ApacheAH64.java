package com.dylanrathbone.app.services;

public class ApacheAH64 implements AirCraft {


    public String initialiseAvionics() {
        return "Apache AH-64 Gunship avionics initialisation sequence started...";
    }

    public String takeOff() {
        return "Vertical take off...";
    }

    public String land() {
        return "Vertical landing...";

    }
    public String barrelRoll() {
        return "Barrel Roll!!!";
    }

    public String bankLeft() {
        return "Banking left...";
    }

    public String bankRight() {
        return "Banking right...";
    }

    public String wheelsUp() {
        return "Wheels up...";
    }

    public String wheelsDown() {
        return "Wheels down...";
    }
}
