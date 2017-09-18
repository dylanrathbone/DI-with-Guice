package com.dylanrathbone.app.services;

public interface AirCraft {

    String initialiseAvionics();
    String takeOff();
    String land();
    String barrelRoll();
    String bankLeft();
    String bankRight();
    String wheelsUp();
    String wheelsDown();
}
