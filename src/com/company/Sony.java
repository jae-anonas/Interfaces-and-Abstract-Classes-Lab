package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class Sony extends Remote implements Rechargeable{

    @Override
    public void channelUp() {
        System.out.println("Sony channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Sony channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Sony volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Sony volume down");
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

}
