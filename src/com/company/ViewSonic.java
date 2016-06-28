package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class ViewSonic extends Remote {

    @Override
    public void channelUp() {
        System.out.println("ViewSonic channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("ViewSonic channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("ViewSonic volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("ViewSonic volume down");
    }

    @Override
    public boolean startScan(String scannedInput) {
        return false;
    }
}
