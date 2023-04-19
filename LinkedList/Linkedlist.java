package.vscode.LinkedList;
import java.util.*;

public class Linkedlist {
    
    //add a node & return the head of the linkedList
    static Node addFirst(Node head, int data){
        Node temp = new Node(data);
        if(head == null){
            return temp;
        }
        else {
            temp.next = head;
            return temp;
        }
    }

    static Node addLast(Node head, int data){
        Node temp = new Node(data);
        if(head == null){
            return temp; 
        }
        else{
            Node ptr = head;
            while(ptr.next!= null){
                ptr = ptr.next;
            }
            ptr.next = temp;
            return head;
        }
    }
    public static void main(String[] args) {

        
    }
    
}
