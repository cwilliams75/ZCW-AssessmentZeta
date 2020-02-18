package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        int i;
        for (i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        //for (integer i : intArray) S += i;
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = 1;

        for (int i  : intArray){
            product *= i;
        }
        //for (integer i : intArray) S *= i;
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
       // double sum = 0;
       // int i;
       // for (i = 0; i < intArray.length; i++)
           // sum += intArray[i];
        return Double.valueOf(getSum(intArray)/intArray.length);

       // return sum / 5;


    }
}
