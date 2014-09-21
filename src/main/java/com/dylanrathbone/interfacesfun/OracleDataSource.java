package com.dylanrathbone.interfacesfun;


public class OracleDataSource implements Datasource {

    public String establishConnection() {
        String connection = "Oracle Connection";
        return connection;
    }

    public String terminateConnection() {
        String terminateConnection = "Oracle Connection Terminated";
        return terminateConnection;
    }

    public String getConnectionStatus() {
        String connectionStatus = "Oracle connection status";
        return connectionStatus;
    }
}
