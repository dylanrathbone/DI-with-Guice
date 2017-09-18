package com.dylanrathbone.interfacesfun;

public interface Datasource {

    public String establishConnection();
    public String terminateConnection();
    public String getConnectionStatus();

}
