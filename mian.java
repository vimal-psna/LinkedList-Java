package Lll;
public class mian{
    public static void main(String[] args) {
        LinkedList  l1=new LinkedList();
        l1.insertFirst(20);
        l1.insertFirst(35);
        l1.insertFirst(56);
        l1.insertFirst(67);
        l1.insertFirst(78);
        l1.insertLast(99);
        l1.insert(55,3);
        System.out.println(l1.deleteFirst());
//        l1.display();
        System.out.println(l1.deleteLast());
        l1.display();

    }
}