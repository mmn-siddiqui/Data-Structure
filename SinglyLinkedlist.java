

package singlylinkedlist;

public class SinglyLinkedList {
    public static void main(String[] args) {
        // TODO code application logic here
       SinglyLinkList slist = new SinglyLinkList();
       slist.AddFirst(10);
       slist.AddFirst(20);
       slist.AddFirst(30);
       slist.AddFirst(40);
       slist.Display();
       
        
    }
    
}

class Node{
 protected int data;
 private Node next;
 
 public Node(int d, Node n){
     data = d;
     next = n;
 }
 public void SetData(int value){
     data=value;
 }
 public void SetNext(Node n){
     next = n;
 }
 public int GetData(){
     return data;
 }
 public Node GetNext(){
     return next;
 }
}
class SinglyLinkList{
    
    private Node head;
    private int size;
    
    public SinglyLinkList(){
        head = null;
        size = 0;
    }
    public void AddFirst(int value){
        Node n = new Node(value,null);
        n.SetNext(head);
        head = n;
        size++;
    }
    public void Display(){
        System.out.println(""+head.data);
        
}
}
