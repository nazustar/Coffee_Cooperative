import observer.*;
import subject.*;

public class Main {
    public static void main(String[] args) {

        //Create the subject and observers.
        CoffeeCoopData coop = new CoffeeCoopData();

        //Create baristas for subscribe.
        Barista b1 = new Barista("Camila Amaya", "1032345032");
        Barista b2 = new Barista("Mario Augusto", "105420434");
        Barista b3 = new Barista("Sofia Lopez", "12894323");

        //They "subscribe" to the subject to recive notifications.
        coop.registerObserver(b1);
        coop.registerObserver(b2);
        coop.registerObserver(b3);

        //Register a new batch.
        coop.registerNewBatch("Java",
            "This coffee has a taste of red fruits and a residual taste of cacao.",
            "Acevedo, Huila",
            1250,
            "Farm The Eden",
            40
        );

        //Remove subscriber for avoid recive notifications.
        coop.removeObserver(b2);

        //Register a new batch.
        coop.registerNewBatch(
            "Pink Bourbon",
            "This coffee has a taste of citrus fruits.",
            "Génova, Quindío",
            1800,
            "Farm Akatsuki",
            35
        );
    }
}