import java.util.ArrayList;
import java.util.List;

public class connect {
    List<Node> save=new ArrayList<>();
    public Node connect(Node root) {
        cal(root,0);
        return root;
    }
    public void cal(Node root,int depth) {
        if(root==null){
            return ;
        }
        if(save.size()==depth){
            save.add(root);
        }else {
            save.get(depth).next=root;
            save.set(depth,root);
        }
        cal(root.left,depth+1);
        cal(root.right,depth+1);
    }
}
