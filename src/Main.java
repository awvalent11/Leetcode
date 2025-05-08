import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        MedianTwoArrays obj = new MedianTwoArrays();
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));

    }
}