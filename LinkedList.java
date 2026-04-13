package Lll;
public class LinkedList {
    private Node head;
    private Node tail;
    public  int size;
    public LinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
     private static class Node{
         int value;
         Node next;
         Node(int value){
        this.value=value;
    }
    public Node(int value,Node next) {
        this.value = value;
        this.next = next;
    }}
     public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
    if(tail==null) {
        head=tail;
    }
    size++;
    }
    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            head = node;
        }else{
            tail.next = node;
            tail = node;
            size++;
        }
    }
    public  void  insert(int value,int index) {
        if (index == 0) {
            insertFirst(value);
        }
        if (index== size) {
            insertLast(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
     size++;
    }
public int deleteFirst() {
    int value = head.value;
    head = head.next;
    if (head == null) {
        tail =null;
    }
    size--;
    return value;
}
public int deleteLast() {
    if (size <= 1) {
        return deleteFirst();
    }
    Node secondLast = get(size - 2);
    int value = tail.value;
    tail = secondLast;
tail.next=null;
return value;
}
    Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
}
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }
      Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
            node=node.next;
            return node;
        }}
        return null;
    }
}