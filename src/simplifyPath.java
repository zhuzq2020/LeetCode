import java.util.*;

public class simplifyPath {
    static Map<Node,Node> ans=new HashMap<>();//key是原链表，value是新链表
    public static Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        if(!ans.containsKey(head)){
            Node temp=new Node(head.val);
            temp.next=copyRandomList(head.next);
            temp.random=copyRandomList(head.random);
            ans.put(head,temp);
        }
        return ans.get(head);
    }

    public static void main(String[] args) {
        Node head=new Node(3);
        Node head1=new Node(4);
        head.next=head1;
        head.random=null;
        copyRandomList(head);
    }
}
