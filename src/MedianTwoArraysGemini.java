public class MedianTwoArraysGemini {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the shorter array to optimize binary search
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = ((m + n + 1) / 2) - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];

            int minX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            int maxY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxX <= minY && maxY <= minX) {
                if ((m + n) % 2 == 0) {
                    return (double) (Math.max(maxX, minY) + Math.min(minX, maxY)) / 2;
                } else {
                    return (double) Math.max(maxX, minY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}

//  You've got a working solution! To optimize it for compute time,
//  we can aim for a solution with logarithmic time complexity,
//  specifically O(log(min(m,n))), where m and n are the lengths of nums1 and nums2.
//  Your current approach merges the two arrays and then finds the median,
//  which has a time complexity of O(m+n).
//
//  Here's a more efficient approach using binary search:
//  Explanation of the Optimized Approach:
//
//  Ensure Shorter Array is nums1: This is for efficiency in the binary search. The binary search will be performed on the shorter array.
//
//  Binary Search: We perform binary search on the possible partitions of the shorter array (nums1).
//
//  partitionX: Represents the number of elements taken from nums1.
//  partitionY: Represents the number of elements taken from nums2.
//  We calculate this to ensure that the total number of elements on the left side (from both arrays)
//  is equal to or one more than the total number of elements on the right side.
//  This is crucial for finding the median.
//  Boundary Conditions: We handle edge cases where partitionX or partitionY might be 0
//  or equal to the length of their respective arrays. In these cases, we use
//  Integer.MIN_VALUE or Integer.MAX_VALUE to effectively represent that there are no elements on that side.
//
//  Checking the Partition: We check if the partitions are correct by comparing the maximum
//  element of the left part of each array with the minimum element of the right part of
//  the other array:
//
//  maxX <= minY and maxY <= minX
//  Calculating the Median:
//
//  Even Total Length: If the total number of elements (m + n) is even,
//  the median is the average of the two middle elements.
//  These two middle elements will be the maximum of the left parts (maxX, minY)
//  and the minimum of the right parts (minX, maxY).
//  Odd Total Length: If the total number of elements is odd,
//  the median is the largest element of the left part (Math.max(maxX, minY)).
//  Adjusting the Search Range:
//
//  If maxX > minY, it means we've taken too many elements from nums1
//  (the left part of nums1 has an element larger than the smallest in the right
//  part of nums2), so we need to decrease high.
//  If maxY > minX, it means we've taken too few elements from nums1,
//  so we need to increase low.
//  Why is this more efficient?
//
//  The binary search reduces the search space in each step by half.
//  Instead of merging the entire arrays (which takes O(m+n) time),
//  we are effectively searching for the correct partition in the shorter array,
//  which takes O(log(min(m,n))) time.
//  The rest of the operations within the loop are constant time.
//
//  This optimized solution significantly improves the compute time,
//  especially when the input arrays are large.















