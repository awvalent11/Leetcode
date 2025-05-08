import java.util.ArrayList;

public class MedianTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> solution = new ArrayList<>();

        if(nums1.length<=nums2.length){
            int j = 0;
            for(int i=0; i<nums1.length; i++) {

                System.out.println("I am i in the for-loop: " + i);
                System.out.println("I am j in the for-loop: " + j);
                int pointer = i;
                while (pointer < nums1.length) {
                    if(nums1[pointer] <= nums2[j]){
                        solution.add(nums1[pointer]);
                        System.out.println(solution);
                        System.out.println(pointer);
                    }
                    pointer++;
                    System.out.println("I AM THE POINTER AND I AM PROUD "+ pointer);
                }

                solution.add(nums2[j]);
                j++;
                i = pointer;
                System.out.println("Solution at the end of the for-loop: "+solution);
                System.out.println("I AM THE i AT THE END OF THE FOR_LOOP AND I AM PROUD "+ i);
                System.out.println("I AM THE j AT THE END OF THE FOR_LOOP AND I AM PROUD "+ j);
            }
            for(int k=j; k<nums2.length; k++){
                solution.add(nums2[k]);
            }

        } else{
            int j = 0;
            for(int i=0; i<nums2.length; i++) {

                System.out.println("I am i in the for-loop: " + i);
                System.out.println("I am j in the for-loop: " + j);
                int pointer = i;
                while (pointer < nums2.length) {
                    if(nums2[pointer] <= nums1[j]){
                        solution.add(nums2[pointer]);
                        System.out.println(solution);
                        System.out.println(pointer);
                    }
                    pointer++;
                    System.out.println("I AM THE POINTER AND I AM PROUD "+ pointer);
                }

                solution.add(nums1[j]);
                j++;
                i = pointer;
                System.out.println("Solution at the end of the for-loop: "+solution);
                System.out.println("I AM THE i AT THE END OF THE FOR_LOOP AND I AM PROUD "+ i);
                System.out.println("I AM THE j AT THE END OF THE FOR_LOOP AND I AM PROUD "+ j);
            }
            for(int k=j; k<nums1.length; k++){
                solution.add(nums1[k]);
            }

        }
        System.out.println("Final Solution: "+solution);
        int middle = solution.size() /2;
        return (double) (solution.get(middle) + solution.get(middle - 1)) /2;

    }
}