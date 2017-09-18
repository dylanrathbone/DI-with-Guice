package com.dylanrathbone.app.services;


import com.google.inject.AbstractModule;

public class Cessna172Injector extends AbstractModule {

    @Override
    protected void configure() {

        /**
         * bind the service to each of the implementation classes
         *
         * i.e.
         *
         * bind AirCraft type to Cessna172 implementation
         */
        bind(AirCraft.class).to(Cessna172.class);
    }
}
