import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> someFruitsInBox;

    public ArrayList<T> getSomeFruitsInBox() {
        return new ArrayList<T>(someFruitsInBox);
    }



    public Box(T... items) {
        this.someFruitsInBox = new ArrayList<T>(Arrays.asList(items));
    }

    public void add(T... items) {
        this.someFruitsInBox.addAll(Arrays.asList(items));
    }

    public void remove(T... items) {
        for (T item : items) this.someFruitsInBox.remove(item);
    }





    public void clear() {
        someFruitsInBox.clear();
    }

    public float getWeight() {
        if (someFruitsInBox.size() == 0) return 0;
        float weight = 0;
        for (T orangeOrApple : someFruitsInBox) weight += orangeOrApple.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void intersperse(Box<? super T> box) {
        box.someFruitsInBox.addAll(this.someFruitsInBox);
        clear();
    }
}
