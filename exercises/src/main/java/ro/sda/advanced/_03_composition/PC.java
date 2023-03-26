package ro.sda.advanced._03_composition;

/*  Create a class Motherboard with the following fields: model, manufacturer, bios (all are String),
 *  ramSlots and cardSlots (both are int)
 *
 *  The class should have:
 *  - a constructor
 *  - getters for all the fields
 *  - a method loadProgram(programName) which will print a message when a program is loaded
 *
 *  Create a class PC which will have a case of type Case, a monitor of type Monitor and a motherboard of type Motherboard
 *
 *  The class should have:
 *  - a constructor
 *  - a method powerUp() - which will call the method for powering up from the Case class
 *  - a method drawLogo() - which will call the method drawPixel from Monitor class */

public class PC {
    private Monitor monitor;
    private Case theCase;

    public PC(Monitor monitor, Case theCase) {
        this.monitor = monitor;
        this.theCase = theCase;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        this.drawLogo();
    }

    public void drawLogo(){
        monitor.drawPixelAt(1200, 500, "red");
    }

}
