class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root , 0 ) ;
    }

    public int helper( TreeNode root , int count )
    {
        if(root == null)
        {
            return count ;
        }

        int left = helper(root.left , count+1) ;
        int right = helper(root.right , count+1) ;

        return Math.max(left , right) ;

    }
}
