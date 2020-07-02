package com.multiplatform;

public class PC {
    private Case theCase;
    protected Motherboard theMotherboard;
    private Monitor theMonitor;

    public PC(Case theCase, Motherboard theMotherboard, Monitor theMonitor) {
        this.theCase = theCase;
        this.theMotherboard = theMotherboard;
        this.theMonitor = theMonitor;
    }

    public void starPC(String programName){
        theCase.pressPowerButton();
        theMotherboard.loadProgram(programName);
        theMonitor.drawPixelAt(1000,800,"yellow");
    }

//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public Motherboard getTheMotherboard() {
//        return theMotherboard;
//    }
//
//    public Monitor getTheMonitor() {
//        return theMonitor;
//    }
}
