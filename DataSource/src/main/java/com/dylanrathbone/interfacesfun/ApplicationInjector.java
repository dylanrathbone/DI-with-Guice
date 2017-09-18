package com.dylanrathbone.interfacesfun;

import com.google.inject.AbstractModule;

public class ApplicationInjector extends AbstractModule {

    protected void configure() {

        /**
         * bind the service to each of the implementation classes
         *
         * i.e.
         *
         * bind DataSource to MongoDBDataSource implementation
         */
        bind(Datasource.class).to(MongoDdDataSource.class);
    }
}
