package com.dylanrathbone.app;

import com.dylanrathbone.app.services.Cessna172Injector;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Pilot {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Cessna172Injector());
        AirCraftFactory airCraftFactory = injector.getInstance(AirCraftFactory.class);
        System.out.println(airCraftFactory.getAirCraft().initialiseAvionics());
        System.out.println(airCraftFactory.getAirCraft().takeOff());
        System.out.println(airCraftFactory.getAirCraft().wheelsUp());
        System.out.println(airCraftFactory.getAirCraft().bankLeft());
        System.out.println(airCraftFactory.getAirCraft().bankRight());
        System.out.println(airCraftFactory.getAirCraft().barrelRoll());
        System.out.println(airCraftFactory.getAirCraft().wheelsDown());
        System.out.println(airCraftFactory.getAirCraft().land());
    }
}
