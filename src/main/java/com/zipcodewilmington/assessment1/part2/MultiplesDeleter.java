package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[i] = 0;
            }
        }
        Integer occ = ArrayUtils.getNumberOfOccurrences(ints, 0);
        Integer[] result = new Integer[ints.length - occ];
        int k = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                result[k] = ints[i];
                k++;
            }
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        Integer[] intArray = new Integer[ints.length];
        Integer counter = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                intArray[counter] = ints[i];
                counter++;
            }
        }

        Integer[] returnObj = new Integer[counter];
        for (int j = 0; j < counter; j++) {
            returnObj[j] = intArray[j];
        }
        return returnObj;
}

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        Integer[] intArray = new Integer[ints.length];
        Integer counter = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 != 0) {
                intArray[counter] = ints[i];
                counter++;
            }
        }

        Integer[] returnObj = new Integer[counter];
        for (int j = 0; j < counter; j++) {
            returnObj[j] = intArray[j];
        }
        return returnObj;

    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        Integer[] intArray = new Integer[ints.length];
        Integer counter = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {
                intArray[counter] = ints[i];
                counter++;
            }
        }

        Integer[] returnObj = new Integer[counter];
        for (int j = 0; j < counter; j++) {
            returnObj[j] = intArray[j];
        }
        return returnObj;

    }
}
