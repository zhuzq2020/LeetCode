public class buildTree {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root=cal(inorder,0, inorder.length-1,postorder,0,postorder.length-1 );
        return root;
    }
    public static TreeNode cal(int[] inorder, int lefti, int righti, int[] postorder, int leftp, int rightp) {
        if(leftp==rightp){
            return new TreeNode(postorder[leftp]);
        }else if(leftp>rightp){
            return null;
        }
        TreeNode root=new TreeNode(postorder[rightp]);
        int i=lefti;
        for(;i<righti;i++){
            if(postorder[rightp]==inorder[i]){
                break;
            }
        }
        root.left=cal(inorder,lefti, i-1,postorder,leftp,leftp+i-1-lefti );
        root.right=cal(inorder,i+1, righti,postorder,leftp+i-1-lefti,rightp-1 );
        return root;
    }

    public static void main(String[] args) {
        TreeNode root=buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});
    }
}