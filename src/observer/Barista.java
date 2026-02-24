package observer;

import subject.*;
import observer.Observer;

public class Barista implements Observer, Display {

    // Barista attributes.
    private String baristaName;
    private String idBarista;

    //Coffe attributes.
    private String varietalCoffee;
    private String tastingNotes;
    private String origin;
    private float cropHeight;
    private String producerName;
    private float availableQuantity;

    //Constructor for barista class.
    public Barista(String baristaName, String idBarista) {
        this.baristaName=baristaName;
        this.idBarista=idBarista;
    }

    //Getters for atributes.
    public String getName() {
        return baristaName;
    }
    public String getId() {
        return idBarista;
    }

    //Interface methods, they work for use the observer pattern.

    //Update method from observer interface.
    @Override
    public void update(String varietalCoffee, String tastingNotes, String origin,
        float cropHeight, String producerName, float availableQuantity) {

        this.varietalCoffee=varietalCoffee;
        this.tastingNotes=tastingNotes;
        this.origin=origin;
        this.cropHeight=cropHeight;
        this.producerName=producerName;
        this.availableQuantity=availableQuantity;
        display();
    }

    //Implementation of display method from Display.
    @Override
    public void display() {
        System.out.println("----------------------------------");
        System.out.println("Notification system in Coffee Cooperative");
        System.out.println("Update for Barista: " + baristaName);
        System.out.println("ID: " + idBarista);
        System.out.println("-----------------------------------");
        System.out.println("Varietal: " + varietalCoffee);
        System.out.println("Tasting notes: " + tastingNotes);
        System.out.println("Origin: " + origin);
        System.out.println("Crop height: " + cropHeight + " meters.");
        System.out.println("Producer: " + producerName);
        System.out.println("Available quantity: " + availableQuantity + " lb.");
        System.out.println("----------------------------------");
    }
}