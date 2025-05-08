import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        int[] nums3 = new int[]{1, 3};
        int[] nums4 = new int[]{2, 7};
        MedianTwoArrays obj = new MedianTwoArrays();
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));
        System.out.println(obj.findMedianSortedArrays(nums3, nums4));

    }
}