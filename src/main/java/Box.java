import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> someFruitsInBox;

    public ArrayList<T> getSomeFruitsInBox() {
        return new ArrayList<T>(someFruitsInBox);
    }



    public Box(T... orangeOrApple) {
        this.someFruitsInBox = new ArrayList<T>(Arrays.asList(orangeOrApple));
    }

    public void add(T... orangeOrApple) {
        this.someFruitsInBox.addAll(Arrays.asList(orangeOrApple));
    }

    public void remove(T... orangeOrApple) {
        for (T item : orangeOrApple) this.someFruitsInBox.remove(item);
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

    public void intersperse(Box<? super T> inWhatWeGiveWeInterpersedOurBox) {
        inWhatWeGiveWeInterpersedOurBox.someFruitsInBox.addAll(this.someFruitsInBox);
        clear();
    }
}
