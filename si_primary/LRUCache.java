import java.util.*;

public class LRUCache {
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;
    Map<Integer, Node> map= new HashMap<>();
    

    class Node{
        Node prev, next;
        int key, value;
        Node(int k, int v){
            key= k;
            value=v;
        }
    }
    public LRUCache(int cap){
        capacity=cap;
        head.next= tail;
        tail.prev= head;
    }

    public int get(int key){
        //  if already in map
        //  extract value
        //  place that node after head by remove and insert function
        if(map.containsKey(key)){
            Node node = map.get(key);   // return node adress
            remove(node); 
            insert(node);
            return node.value;      // get node value
        }
        // if not in map return -1
        return -1;
    }

    public void put(int key, int value){
        //  if already in map we replace it next to head with updated values if required;
        // if cap reached remove tail.prev to create space
        // insert node next to head 
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    private void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void insert(Node node){
        // insert key , node to hashmap
        //  change links  to insert the nead next to head
        map.put(node.key, node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }
    public List<Integer> getList(){
        List<Integer> result= new ArrayList<>();
        Node temp= head.next;
        while(temp!=tail){
            result.add(temp.key);
            temp=temp.next;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] pages= new int[n];
            for(int i=0; i<n; i++){
                pages[i]=sc.nextInt();
            }
            LRUCache lru = new LRUCache(k);
            for(int page: pages){
                lru.put(page,page);
            }
            
            List<Integer> result= lru.getList();
            for(int i=result.size()-1; i>=0; i--){
                System.out.print(result.get(i)+" ");

            }

            

        }
        sc.close();
    }
    
}



// 3
// 5 3
// 3 8 2 8 1 
// 8 5
// 4 7 3 10 7 8 5 3 
// 10 5
// 6 5 6 2 3 14 2 1 10 10