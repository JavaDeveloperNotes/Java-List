package my.zhamri.convert;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

    public static void main(String[] args) {

        String[] numbers = {"one", "two", "three", "four"};
        for (String num : numbers) {
            System.out.println(num);
        }

        List<String> myString = Arrays.asList(numbers);
        System.out.println(myString);
    }
}


/***
 * one
 * two
 * three
 * four
 * [one, two, three, four]
 */
