package com.dylanrathbone.interfacesfun;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[]args) {

        Injector injector = Guice.createInjector(new ApplicationInjector());
        Client client = injector.getInstance(Client.class);
        client.callDataSourceMethods();
    }
}