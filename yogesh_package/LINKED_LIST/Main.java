package yogesh_package.LINKED_LIST;

public class Main {
    public static void main(String[] args) {
        linked_list list=new linked_list();
        list.insertLast(45);
        list.insertLast(56);
        list.insertLast(5); 
        list.insertLast(78);
        list.insertFirst(23);
        list.insertAtPLace(1, 10);
        list.displayNodes();
        System.out.println("\nDeleted : "+list.deleteFirst());
        list.displayNodes();

        System.out.println("\nDeleted : "+list.deleteAtPlace(3));
        list.displayNodes();
    }
}
