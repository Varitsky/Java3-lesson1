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
        System.out.println(Arrays.toString(arrList.toArray()));


        Apple redApple = new Apple();
        Apple poisonedApple = new Apple();
        Apple artificalApple = new Apple();

        Orange hamlin = new Orange();
        Orange verna = new Orange();

        Box<Apple> appleBox = new Box<>(redApple, poisonedApple, artificalApple);
        Box<Orange> orangeBox = new Box<>(hamlin, verna);

        //Сравниваем две коробки
        System.out.println(appleBox.compare(orangeBox));

        //Добавляем апельсинчик и сравниваем ещё раз
        Orange salustiana = new Orange();
        orangeBox.add(salustiana);
        System.out.println(appleBox.compare(orangeBox));


        Box<Orange> anotherOrangeBox = new Box<>();
        // Пересыпаем OrangeBox в anotherOrangeBox
        orangeBox.intersperse(anotherOrangeBox);
        System.out.println(orangeBox.getWeight());
        System.out.println(anotherOrangeBox.getWeight());

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

