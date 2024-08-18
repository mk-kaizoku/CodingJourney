class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class linked_list_intro {
    public static void main(String[] args){
        int[] arr={10,23,55,32};
        Node y= new Node(arr[0]);
        System.out.print(y.data);
    }
    
}
