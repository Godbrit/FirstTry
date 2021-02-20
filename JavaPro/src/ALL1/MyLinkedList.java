package ALL1;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedListClass linkedListClass = new LinkedListClass();
        linkedListClass.add(1);
        linkedListClass.add(2);
        linkedListClass.add(10);


        System.out.println(linkedListClass);
        System.out.println(linkedListClass.get(0));
        System.out.println(linkedListClass.get(1));
        System.out.println(linkedListClass.get(2));
       // System.out.println(linkedListClass.get(5));
        linkedListClass.remove(1);
        System.out.println(linkedListClass);
    }
}
