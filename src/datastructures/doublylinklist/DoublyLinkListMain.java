package datastructures.doublylinklist;

public class DoublyLinkListMain {
    public static void main(String[] args) {

        DoublyLinkList doublyLinkList = new DoublyLinkList(2);
        doublyLinkList.append(3);
        doublyLinkList.append(4);

        System.out.println(doublyLinkList.remove(0).value);

        System.out.println("--------------------");
        doublyLinkList.printList();
    }
}
