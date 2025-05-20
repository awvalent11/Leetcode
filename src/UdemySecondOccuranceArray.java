import java.util.HashMap;

public class UdemySecondOccuranceArray {
    public int findSecondOccurance(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if(map.containsKey(nums[i])) {
                return nums[i];
            } else {
                map.put(nums[i], 1);
            }
        }

        return -1;
    }
}
