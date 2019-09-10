
import java.util.ArrayList;


public class Box<T extends Fruit> {
    public ArrayList<T> getItems() {
        return items;
    }

    private ArrayList<T> items;

    public Box(ArrayList<T> items) {
        this.items = items;

    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (int i = 0; i < items.size(); i++) {
            totalWeight = totalWeight + items.get(i).getWeight();
        }
        return totalWeight;

    }


    public boolean compare(Box<T> anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.0001f;
    }

    public void replaceItems(Box<T> anotherBox) {
        anotherBox.items.addAll(this.items);
        this.items.clear();

    }

    public void addItem(T item) {
        items.add(item);
    }
}
