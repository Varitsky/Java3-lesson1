import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Integer[] intArr = new Integer[2];
        intArr[0] = 1;
        intArr[1] = 2;

        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));

        String[] strArr = new String[3];
        strArr[0] = "First";
        strArr[1] = "Second";
        strArr[2] = "Third";

        System.out.println(Arrays.deepToString(strArr));
        swap(strArr, 0, 2);
        System.out.println(Arrays.deepToString(strArr));


        ArrayList<Integer> arrList = helloArrayList(intArr);
        arrList.stream().forEach(System.out::print);


        Apple redApple = new Apple();
        Apple poisonedApple = new Apple();
        Apple artificalApple = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(redApple, poisonedApple, artificalApple);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
        box2.intersperse(box3);
    }


    public static void swap(Object[] arr, int eto, int to) {
        Object vot = arr[eto];
        arr[eto] = arr[to];
        arr[to] = vot;
        System.out.println("SWAPPED!");
    }

    public static <T> ArrayList<T> helloArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }


}

