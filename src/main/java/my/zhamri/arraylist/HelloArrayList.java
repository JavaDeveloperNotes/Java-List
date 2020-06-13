package my.zhamri.arraylist;

import java.util.ArrayList;

public class HelloArrayList {

    public static void main(String[] args) {

        ArrayList anyList = new ArrayList();

        anyList.add(123);      // index 0
        anyList.add("Java");
        anyList.add(20.8);    // index 2
        anyList.add('A');
        System.out.println(anyList);

        anyList.remove(1);
        System.out.println(anyList);

        anyList.add("Python");
        System.out.println(anyList);

        anyList.add(0, "Java");
        System.out.println(anyList);
    }
}

/***
 * [123, Java, 20.8, A]
 * [123, 20.8, A]
 * [123, 20.8, A, Python]
 * [Java, 123, 20.8, A, Python]
 */
