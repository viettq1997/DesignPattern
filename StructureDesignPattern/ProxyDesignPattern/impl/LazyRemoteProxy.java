package StructureDesignPattern.ProxyDesignPattern.impl;

import StructureDesignPattern.ProxyDesignPattern.Remote;

public class LazyRemoteProxy implements Remote {

    private RemoteImpl remote = null;

    @Override
    public void turnOn() {
        System.out.println("Wrapee" + this.remote);
        if(this.remote == null) {
            this.remote = new RemoteImpl();
        } else this.remote.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Wrapee" + this.remote);
        if(this.remote == null) {
            this.remote = new RemoteImpl();
        } else this.remote.turnOff();
    }
    
}
