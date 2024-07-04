import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
    List<Integer> save=new ArrayList<>();
    int seq=0;

    public BSTIterator(TreeNode root) {
        BST(root);
    }

    public int next() {
        return save.get(seq++);
    }

    public boolean hasNext() {
        if(seq>=save.size()){
            return false;
        }else {
            return true;
        }
    }

    public void BST(TreeNode root) {
        if(root==null){
            return;
        }
        BST(root.left);
        save.add(root.val);
        BST(root.right);
    }
}
