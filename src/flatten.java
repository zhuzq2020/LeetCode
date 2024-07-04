public class flatten {
    public static void flatten(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        if(root.left!=null){
            if(root.right!=null){
                TreeNode temp=root.right;
                root.right=root.left;
                while(root.right!=null){
                    root=root.right;
                }
                root.right=temp;
            }else{
                root.right=root.left;
            }
            root.left=null;
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right=new TreeNode(5);
        root.right.right=new TreeNode(6);
        flatten(root);
    }
}
