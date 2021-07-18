package StructureDesignPattern.ProxyDesignPattern.impl;

import StructureDesignPattern.ProxyDesignPattern.Remote;

public class RemoteImpl implements Remote {

    @Override
    public void turnOn() {
        System.out.println("turn On the light");
        
    }

    @Override
    public void turnOff() {
        System.out.println("turn Off the light");
        
    }
    
}
