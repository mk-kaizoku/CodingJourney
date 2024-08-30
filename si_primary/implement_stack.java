//  Took a long idk why i passed the sample case 
//  understand code carefully

import java.util.*;
import java.io.*;
class Stack{        // Initialize stack class with size, arr[size], top=-1
    int size=10001;
    int arr[] = new int[size];
    int top=-1;

    
    public void push(int x){        // insert element into stack 
        if(top<size-1){             // check if we used up entire arr by checking top position must be less than size 
            top++;                  // if not move top and place element in the array indicating new top of stack
            arr[top]=x;
        }
    }

    public int pop(){                // deletion of the element in the stack
        if(top==-1){                 // if top is -1 no elements in stack so return -1 or empty;
            return -1;               
        }
        int x=arr[top];              // else if element is there then store the element to print
        top--;                      // then move top back pointing to new top element in the stack assumed array
        return x;                   // return the stored element which is popped
    }
    public boolean isEmpty(){
        return top==-1;              // check if stack empty if top is at -1 stack empty else not
    }
}
public class implement_stack {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        
        Stack s= new Stack();
        while(t-->0){
            String str= sc.nextLine();          // read entire string
            String[] op=str.split(" ");     // split the string and store in string array

            if(op[0].equals("push")){    // at 0 index we have operation to perform and at 1 index we have integer
                int x=Integer.parseInt(op[1]);
                s.push(x);
            }else if(op[0].equals("pop")){
                if(s.isEmpty()){
                    System.out.println("Empty");
                }else{
                    System.out.println(s.pop());
                }
            }
        }
        
        sc.close();

    }
}