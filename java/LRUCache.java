import java.util.*;

public class LRUCache {
    int capacitySet=Integer.MAX_VALUE;
    Map<Integer,Integer> save=new HashMap<>();
    Queue<Integer> order=new LinkedList<>();
    public LRUCache(int capacity) {
        capacitySet=capacity;
    }

    public int get(int key) {
        if(save.containsKey(key)){
            order.add(order.poll());
            return save.get(key);
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(save.containsKey(key)){
            save.put(key,value);
            order.remove(key);
            order.add(key);
        }else{
            if(save.size()==capacitySet){
                save.remove(order.poll());
            }
            save.put(key,value);
            order.add(key);
        }
    }
}
