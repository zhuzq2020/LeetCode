public class buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=cal(preorder,0, preorder.length,inorder,0,inorder.length );
        return root;
    }
    public TreeNode cal(int[] preorder,int leftp,int rightp, int[] inorder,int lefti,int righti) {
        if(leftp>=rightp||lefti>=righti){
            return null;
        }
        TreeNode root=new TreeNode(preorder[leftp]);
        for(int i=lefti;i<=righti;i++){
            if(preorder[leftp]==inorder[i]){
                break;
            }
        }
        root.left=cal(preorder,0, preorder.length-1,inorder,0,inorder.length-1 );
        root.right=cal(preorder,0, preorder.length-1,inorder,0,inorder.length-1 );
        return root;
    }
}
