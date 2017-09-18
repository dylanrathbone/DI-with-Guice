package com.dylanrathbone.app.services;

public class Cessna172 implements AirCraft {

    public String initialiseAvionics() {
        return "Cessna 172 warming up valves and calibrating alitude indicator...";
    }

    public String takeOff() {
        return "Taking off...";
    }

    public String land() {
        return "Landing...";
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
