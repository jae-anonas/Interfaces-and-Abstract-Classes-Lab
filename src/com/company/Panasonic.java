package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class Panasonic extends Remote {

    @Override
    public void channelUp() {
        System.out.println("Panasonic channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Panasonic channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Panasonic volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Panasonic volume down");
    }


    @Override
    public boolean startScan(String scannedInput) {
        return false;
    }


}
