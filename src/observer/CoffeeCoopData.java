package observer;

import java.util.ArrayList;
import observer.Observer;
import subject.Subject;

public class CoffeeCoopData implements Subject{

    //Attributes for getters.
    private String varietalCoffee;
    private String tastingNotes;
    private String coffeeOrigin;
    private float cropHeight;
    private String productorName;
    private float availableQuantity;

    //Array for observers.
    protected ArrayList<Observer> observers;

    //Constructor.
    public CoffeeCoopData(){
        observers = new ArrayList<>();
    }

    //Implementations from subject.
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(varietalCoffee, tastingNotes, coffeeOrigin, 
                    cropHeight, productorName,availableQuantity);
        }
    }

    //Class Method for register new batch.
    public void registerNewBatch(String varietalCoffee, String tastingNotes, String coffeeOrigin,
                                float cropHeight, String productorName, float availableQuantity) {
        this.varietalCoffee = varietalCoffee;
        this.tastingNotes = tastingNotes;
        this.coffeeOrigin = coffeeOrigin;
        this.cropHeight = cropHeight;
        this.productorName = productorName;
        this.availableQuantity = availableQuantity;

        notifyObservers();
    }
}
