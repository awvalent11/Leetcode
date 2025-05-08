import java.util.ArrayList;

public class ArrayManipulator {

    public ArrayList<Integer> manipulate(int[] array){
        ArrayList<Integer> arrayToReturn = new ArrayList<>();
        arrayToReturn.add(array[0]+array[1]);
        for (int i = 1; i < array.length-1; i++) {
            int value = array[i] + array[i + 1];
            arrayToReturn.add(value);
        }
        arrayToReturn.add(array[array.length-1]+array[array.length-2]);

        return arrayToReturn;
    }
}
