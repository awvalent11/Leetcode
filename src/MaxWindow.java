import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxWindow {
        public int[] maxSlidingWindow(int[] nums, int k) {
//            ArrayList<Integer> listToReturn= new ArrayList<>();
            if(k>=nums.length){
                int max=0;
                for(int i=0; i<nums.length; i++){
                    if (nums[i]>max){
                        max=nums[i];
                    }
                }
                return new int[]{max};
            }
            int n=nums.length;
            int[] result = new int[n-k+1];
            Deque<Integer> deque = new ArrayDeque<>();
            int resultIndex =0;
            for(int i=0; i<n; i++){
                System.out.println("This is i: "+i);
                while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                    deque.pollLast();
                }
                System.out.println("This is Deque midway through: "+deque);
                deque.offerLast(i);
                System.out.println("Deque peek first: "+deque.peekFirst());
                if(deque.peekFirst() <= i-k){
                    deque.pollFirst();
                }
                System.out.println("Result Array: "+ Arrays.toString(result));
                if(i>=k -1){
                    result[resultIndex++] = nums[deque.peekFirst()];
                }
            }
            return result;

            // for(int i=0; i<=nums.length-k; i++){
            //     int localMax=-1000000000;
            //     for(int j=i; j<i+k; j++){
            //         if(nums[j]>localMax){
            //             localMax=nums[j];
            //         }
            //     }
            //     listToReturn.add(localMax);
            //     localMax=0;
            // }
            // int[] arrayToReturn = new int[listToReturn.size()];
            // for(int i=0; i<listToReturn.size(); i++){
            //     arrayToReturn[i]=listToReturn.get(i);
            // }
            // return arrayToReturn;
        }
    }