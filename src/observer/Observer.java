package observer;

public interface Observer {
    public void update(String varietal, String tastingNotes, String origin, 
                    float cropHeight, String product, float availableQuantity);
}