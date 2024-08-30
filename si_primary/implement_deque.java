import java.util.*;

public class implement_deque {
    static class Deque{
        int[] deque;
        int front, back, size, capacity;

        public Deque(int cap){
            capacity=cap;
            deque=new int[capacity];
            front=-1;
            back=-1;
            size=0;
        }
        public void pushFront(int x){
            if(size==capacity){
                return;
            }
            if(size==0){
                front=0;
                back=0;
            }
            else{
                front=(front-1+capacity)%capacity;
            }
            deque[front]=x;
            size++;
        }
        public void pushBack(int x){
            if(size==capacity){
                return;
            }
            if(size==0){
                front=0;
                back=0;
            }else{
                back=(back+1)%capacity;
            }
            deque[back]=x;
            size++;
        }
        public void popFront(){
            if(size==0){
                System.out.println("Empty");
                return;
            }
            System.out.println(deque[front]);
            front=(front+1)%capacity;
            size--;
            if(size==0){
                front=-1;
                back=-1;
            }
        }
        public void popBack(){
            if(size==0){
                System.out.println("Empty");
                return;
            }
            System.out.println(deque[back]);
            back=(back-1+capacity)%capacity;
            size--;
            if(size==0){
                front=-1;
                back=-1;
            }
        }

    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        Deque deque = new Deque(10000);
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("push_front")){
                int x = sc.nextInt();
                deque.pushFront(x);
            }
            else if(s.equals("push_back")){
                int x=sc.nextInt();
                deque.pushBack(x);
            }
            else if(s.equals("pop_front")){
                deque.popFront();
            }else if(s.equals("pop_back")){
                deque.popBack();
            }
        }
        sc.close();
    }
}