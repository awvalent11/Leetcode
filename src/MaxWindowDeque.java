
import java.util.ArrayDeque;
import java.util.Deque;

public class MedianTwoArraysDeque {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        int resultIndex = 0;

        for (int i = 0; i < n; i++) {
            // Remove elements from the back of the deque that are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element's index to the back of the deque
            deque.offerLast(i);

            // Remove elements from the front of the deque that are out of the current window
            if (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // If the window has reached size k, the front of the deque contains the index of the maximum element
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
//
//
//    Explanation of the Optimized Approach:
//
//    Deque for Efficient Tracking: We use a deque to store the indices of elements within the current window. The key idea is to maintain the deque in such a way that the element at the front is always the index of the maximum element in the current window.
//
//    Maintaining Decreasing Order: As we iterate through the array, for each new element nums[i], we remove any elements from the back of the deque whose corresponding values are smaller than nums[i]. This ensures that the deque maintains a decreasing order of element values (based on their indices).
//
//    Handling Out-of-Bounds Elements: Before adding the current element's index, we check if the index at the front of the deque is outside the current window (i.e., deque.peekFirst() <= i - k). If it is, we remove it from the front.
//
//    Adding the Current Element: We add the index i of the current element to the back of the deque.
//
//    Recording the Maximum: Once the window size reaches k (i.e., when i >= k - 1), the element at the front of the deque (nums[deque.peekFirst()]) is the maximum element in the current window. We add this maximum to our result array.
//
//     Why is this more compute-efficient?
//
//     Each element in the nums array is added to and removed from the deque at most once.
//     The operations on the deque (adding, removing from front or back, peeking) take constant time, O(1).
//     Therefore, the overall time complexity of this algorithm is O(n), where n is the length of the nums array. This is a significant improvement over the original O(n⋅k) complexity, especially when k is large.
//     This optimized solution avoids redundant comparisons by efficiently maintaining a data structure that allows us to quickly identify the maximum element in each sliding window.