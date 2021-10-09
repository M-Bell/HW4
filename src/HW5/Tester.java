package HW5;

import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Created list of Integers (bounded to Numbers)");
        MyListUpperNumbers<Integer> intMyListNum = new MyListUpperNumbers<>();
        intMyListNum.add(1);
        intMyListNum.add(2);
        intMyListNum.add(5);
        intMyListNum.add(3);
        intMyListNum.add(4);
        System.out.println(intMyListNum.smallest());
        System.out.println(intMyListNum.largest());
        System.out.println();
        //Invalid type
        //MyListUpperNumbers<String> invalid = new MyListUpperNumbers<>();


        System.out.println("Created list of Integers (bounded to Comparable)");
        MyList<Integer> intMyList = new MyList<>();
        intMyList.add(1);
        intMyList.add(2);
        intMyList.add(5);
        intMyList.add(3);
        intMyList.add(4);
        System.out.println(intMyList.smallest());
        System.out.println(intMyList.largest());
        System.out.println();

        System.out.println("Created list of Strings (bounded to Comparable)");
        MyList<String> stringMyList = new MyList<>();
        stringMyList.add("dbc");
        stringMyList.add("add");
        stringMyList.add("a");
        stringMyList.add("zzz");
        stringMyList.add("asdasdsadxzcz");
        System.out.println(stringMyList.smallest());
        System.out.println(stringMyList.largest());
        System.out.println();

        System.out.println("Created list of Double with array in constructor");
        Double[] arr = {7.7, 1.2, 9.0, 2.2, 5.66};
        MyList<Double> arrayDoubleList = new MyList<>(arr);
        System.out.println(arrayDoubleList.smallest());
        System.out.println(arrayDoubleList.largest());
    }
}
