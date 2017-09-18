package com.dylanrathbone.app.services;

import com.google.inject.AbstractModule;

public class ApacheAH64Injector extends AbstractModule {

    @Override
    protected void configure() {

        /**
         * bind the service to each of the implementation classes
         *
         * i.e.
         *
         * bind AirCraft type to ApacheAH64 implementation
         */
        bind(AirCraft.class).to(ApacheAH64.class);
    }
}