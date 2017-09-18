package com.dylanrathbone.interfacesfun;

public class MySqlDataSource implements Datasource {

    public String establishConnection() {
        String connection = "MySql Connection";
        return connection;
    }

    public String terminateConnection() {
        String terminateConnection = "MySql Connection Terminated";
        return terminateConnection;
    }

    public String getConnectionStatus() {
        String connectionStatus = "MySql connection status";
        return connectionStatus;
    }
}
