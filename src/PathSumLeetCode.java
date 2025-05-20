public class PathSumLeetCode {
//
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//
//        if(root == null){
//            return false;
//        }
//
//
//
//        int length = 1;
//        System.out.println("Target Sum: "+targetSum);
//        targetSum -= root.val;
//        // System.out.println("Target Sum after adding root value: "+ targetSum);
//        System.out.println("Length: "+length);
//        if(targetSum == 0 && length>1){
//            return true;
//        }
//        if(root.left == null && root.right == null){
//            return false;
//        } else {
//            findPaths(root, targetSum, length);
//        }
//    }
}