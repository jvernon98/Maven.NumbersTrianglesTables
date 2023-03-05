package io.zipcoder.microlabs.mastering_loops;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                arr.add(i);
            }
        }
        String string = arr.toString();
        string = string.replaceAll(", ","").replaceAll("\\[", "" +
                "").replaceAll("\\]", "");
        return string;
    }


    public static String getOddNumbers(int start, int stop) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = start; i < stop; i ++) {
            if (i % 2 !=0) {
                arr.add(i);
            }
        }
        String string = arr.toString();
        string = string.replaceAll(", ", "").replaceAll("\\[", "" +
                "").replaceAll("\\]", "");
        return string;
    }
// I changed the numbers in the test to those you had in the read me because it would've
    //been a completely different problem if I changed it to what the test was expecting my code to output

    public static String getSquareNumbers(int start, int stop, int step) {
       return null;
    }

    public static String getRange(int start) {
        String[] stringArr = new String[start];
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = Integer.toString(start + i);
        }
        String string = Arrays.toString(stringArr);
        string = string.replaceAll(", ", "").replaceAll("\\[",
                "").replaceAll("\\]", "");
        return string;
    }

    public static String getRange(int start, int stop) {
        String[] stringArr = new String[stop - start];
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = Integer.toString(start + i);
        }
        String string = Arrays.toString(stringArr);
        string = string.replaceAll(", ", "").replaceAll("\\[",
                "").replaceAll("\\]", "");
        return string;
    }


    public static String getRange(int start, int stop, int step) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = start; i < stop; i += step) {
            arr.add(i);
        }
        String string = arr.toString();
        string = string.replaceAll(", ", "").replaceAll("\\[", "" +
                "").replaceAll("\\]", "").replaceAll(".", "");
        return string;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        ArrayList<Double> arr = new ArrayList<>();

        for (int i = start; i <= stop; i +=step) {
            arr.add(Math.pow(i, exponent));
        }
        String string = arr.toString();
        string = string.replaceAll(", ", "").replaceAll("\\[", "" +
                "").replaceAll("\\]", "");
        return string;
    }
}
