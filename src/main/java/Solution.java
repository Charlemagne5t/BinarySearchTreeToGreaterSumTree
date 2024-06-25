public class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }
    void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.right);
        root.val += sum;
        sum = root.val;
        dfs(root.left);
    }
}
