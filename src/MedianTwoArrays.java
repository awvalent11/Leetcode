import java.util.ArrayList;

public class MedianTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> solution = new ArrayList<>();

        int i = 0, j = 0;

        boolean nums2IsLonger = true;
        while(i < nums1.length && j < nums2.length) {
            System.out.println("I am i: " + i + " I am j: " + j);
            if (nums1[i] <= nums2[j]) {
                solution.add(nums1[i]);
                i++;
            } else {
                solution.add(nums2[j]);
                j++;
            }
            System.out.println("Solution: " + solution);
        }

        System.out.println("Mezzaine Solution: " + solution);
        if(j>nums2.length-1){
            nums2IsLonger=false;
        } else {
            nums2IsLonger=true;
        }

        System.out.println("Does nums2 have more elements? " + nums2IsLonger);


        if(nums2IsLonger){

            for(int k=j; k<nums2.length; k++){
                System.out.println("k: "+k);
                solution.add(nums2[k]);
                System.out.println("Solution: " + solution);
            }
        } else{
            for(int k=i; k<nums1.length; k++){
                System.out.println("k: "+k);
                solution.add(nums1[k]);
                System.out.println("Solution: " + solution);
            }
        }

        System.out.println("Final Solution: "+solution);
        int middle = solution.size() /2;
        return (double) (solution.get(middle) + solution.get(middle - 1)) /2;

    }
}