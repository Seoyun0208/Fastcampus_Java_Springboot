package com.company.design.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
