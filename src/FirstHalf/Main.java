package FirstHalf;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FirstHalf str = new FirstHalf("2, 1, 2, 1");
        System.out.println(str.getResult());

        Double[] doubles = new Double[] {2.0, 4.0, 3.0, 8.0, 13.0};
        FirstHalf array = new FirstHalf(doubles);
        System.out.println(array.getResult());

        List<Double> listDouble = new ArrayList<>();
        listDouble.add(2.0);
        listDouble.add(3.0);
        listDouble.add(4.0);
        listDouble.add(6.0);
        FirstHalf list = new FirstHalf(listDouble);
        System.out.println(list.getResult());
    }
}