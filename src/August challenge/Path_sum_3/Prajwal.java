/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution
{
    public int pathSum(TreeNode root, int sum)
    {
        if(root == null)
            return 0;

        return numberOfPathsToSum(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
    }


    public int numberOfPathsToSum(TreeNode root, int sum)
    {
        int paths = 0;
        if(root == null)
            return paths;

        if(root.val == sum)
            paths++;

        paths += numberOfPathsToSum(root.left, sum - root.val);
        paths += numberOfPathsToSum(root.right, sum - root.val);

        return paths;

    }
}