class PathSum  {
    int length;
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null){
            return false;
        }

        if(root.val == targetSum && root.left==null & root.right == null){
            return true;
        }


        // int length;
        // queue.offer(root);

        // System.out.println("Target Sum: "+targetSum);
        targetSum -= root.val;
        // System.out.println("Target Sum after adding root value: "+ targetSum);

        if(targetSum == 0 && length>0 && root.left==null && root.right==null){
            return true;
        }
        if(root.left == null && root.right == null){
            return false;
        }
        else {

            length++;
            boolean leftTargetSum = hasPathSum(root.left, targetSum);
            boolean rightTargetSum = hasPathSum(root.right, targetSum);
            // System.out.println("Length: "+length);
            // System.out.println("Left Target Sum: "+leftTargetSum);
            // System.out.println("Right Target Sum: "+rightTargetSum);
            if(leftTargetSum == true && length>0 ){
                return true;
            }
            if(rightTargetSum == true && length>0 ){
                return true;
            }
//            queue.offer(root);
            return hasPathSum(root.left, targetSum) && hasPathSum(root.right, targetSum);
        }

    }
}
