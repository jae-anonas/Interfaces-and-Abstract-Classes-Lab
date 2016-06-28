package com.company;

/**
 * Created by roosevelt on 6/28/16.

 Abstract Class

 Create an abstract class called Remote.

 Give the abstract class the property needsBatteries and supportsUsb.

 Create a constructor that accepts parameters to set the properties you just created.

 Create getters and setters for the properties.

 Declare the following abstract methods, channelUp, channelDown, volumeUp, volumeDown;
 they all take no parameters and return nothing.

 Implement
 powerButtonPressed that does not take any parameters and just prints out that the power
 button was pressed.

 Implement numberButtonPressed, that takes in an int parameter and appends/concatenates
 the int parameter to the String "Changing channel to " then prints it out to the terminal.
 */

public abstract class Remote implements FingerPrintScanner{
    private boolean mNeedsBatteries;
    private boolean mSupportsUsb;
    protected String mPassCode;

    public String getPassCode(){
        return mPassCode;
    }

    public void setPassCode(String code){
        mPassCode = code;
    }

    public Remote(String code){
        mPassCode = code;
    }
    public Remote() {
        mNeedsBatteries = true;
        mSupportsUsb = false;
    }

    public Remote(boolean needsBatteries, boolean supportsUsb, String code) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
        mPassCode = code;
    }

    public boolean needsBatteries() {
        return mNeedsBatteries;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        mNeedsBatteries = needsBatteries;
    }

    public boolean supportsUsb() {
        return mSupportsUsb;
    }

    public void setSupportsUsb(boolean supportsUsb) {
        mSupportsUsb = supportsUsb;
    }

    public void powerButtonPressed(){
        System.out.println("Power button was pressed...");
    }

    public void numberButtonPressed(int num){
        System.out.println("Changing channel to " + num + "...");
    }

    public abstract void channelUp();
    public abstract void channelDown();
    public abstract void volumeUp();
    public abstract void volumeDown();

    @Override
    public boolean startScan(String scannedInput) {
        return scannedInput.equals(mPassCode);
    }

}
