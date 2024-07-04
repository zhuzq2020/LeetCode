import java.util.HashMap;
import java.util.Map;

public class lowestCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right=new TreeNode(5);
        root.right.right=new TreeNode(6);
        lowestCommonAncestor(root,root.left,root.right);
    }
}
