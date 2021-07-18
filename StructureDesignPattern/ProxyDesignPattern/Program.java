package StructureDesignPattern.ProxyDesignPattern;

import StructureDesignPattern.ProxyDesignPattern.impl.LazyRemoteProxy;

public class Program {
    public static void main(String[] args) {
        Remote remoteProxy = new LazyRemoteProxy();
        remoteProxy.turnOn();
        remoteProxy.turnOff();
    }
}
