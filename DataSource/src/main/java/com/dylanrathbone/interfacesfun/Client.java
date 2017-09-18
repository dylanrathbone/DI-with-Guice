package com.dylanrathbone.interfacesfun;

import javax.inject.Inject;

public class Client
{
        static Datasource datasource;

        @Inject
        public Client(Datasource datasource) {

            this.datasource = datasource;
        }

        public static void callDataSourceMethods() {
            System.out.println(datasource.establishConnection());
            System.out.println(datasource.getConnectionStatus());
            System.out.println(datasource.terminateConnection());
        }
}
