package algorithms;

public class LeetCode19 {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    public int maxGain(TreeNode node)
    {
        if(node==null)
            return 0;

        int leftGain = Math.max(maxGain(node.left),0);
        int rightGain = Math.max(maxGain(node.right),0);

        int priceNewpath = node.val + leftGain + rightGain;
        maxSum = Math.max(maxSum,priceNewpath);

        return node.val + Math.max(leftGain,rightGain);
    }

}
