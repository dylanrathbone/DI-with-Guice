package com.dylanrathbone.interfacesfun;

public class MongoDdDataSource implements Datasource {

    public String establishConnection() {
        String connection = "MondoDB Connection";
        return connection;
    }

    public String terminateConnection() {
        String terminateConnection = "MondoDB Connection Terminated";
        return terminateConnection;
    }

    public String getConnectionStatus() {
        String connectionStatus = "MondoDB connection status";
        return connectionStatus;
    }
}
