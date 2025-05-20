import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        //should return 2
        int[] array2 = {2, 1, 1, 2, 3, 5, 1, 2, 4};
        //should return 1
        int[] array3 = {2, 3, 4, 5};
        //should return undefined
//        UdemySecondOccuranceArray uca = new UdemySecondOccuranceArray();
//        System.out.println(uca.findSecondOccurance(array1));
//        System.out.println(uca.findSecondOccurance(array2));
//        System.out.println(uca.findSecondOccurance(array3));

        // Binary Search Trees
//        TreeMap<Integer, String> treeMap = new TreeMap<>();
//        treeMap.put(10, "Value 10");
//        treeMap.put(5, "Value 5");
//        treeMap.put(15, "Value 15");
//        System.out.println(treeMap);

//        UdemyDSARecursion udemyDSARecursion = new UdemyDSARecursion();
//        System.out.println(udemyDSARecursion.findFactorialValue(5));
          FibSequence fibSequence = new FibSequence();
          System.out.println(fibSequence.fib(7));
    }
}