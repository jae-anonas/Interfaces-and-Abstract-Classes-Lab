package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class JVC extends Remote {

    @Override
    public void channelUp() {
        System.out.println("JVC channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("JVC channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("JVC volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("JVC volume down");
    }

    @Override
    public boolean startScan(String scannedInput) {
        return false;
    }
}
