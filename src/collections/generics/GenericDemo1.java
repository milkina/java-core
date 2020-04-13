package collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo1 {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();
        iList.add(1);
        iList.add(5);
        iList.add(8);
        iList.add(9);

        System.out.println(getAverage(iList));

        List<Double> iDouble = new ArrayList<>();
        iDouble.add(1.7);
        iDouble.add(5.7);
        iDouble.add(8.3);
        iDouble.add(9.2);
        //Ошибка компиляции -  List<Integer> iList=iDouble;
        // System.out.println(getAverage(iDouble));
    }

    public static Number getAverage(List<? extends Number> list) {
        double result = 0;
        Number average;
        for (Number d : list) {
            result += d.doubleValue();
        }
        average = result / list.size();
        //  list.add(average);
        return average;
    }
}
