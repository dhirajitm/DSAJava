package datastructures;

import datastructures.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(5);
        myLinkedList.prepend(1);
        myLinkedList.printList();

        myLinkedList.reverse();
//        System.out.println(myLinkedList.remove(1).value);
//        myLinkedList.printList();
//        myLinkedList.set(2, 88);
//        System.out.println("At "+myLinkedList.get(2).value);

        System.out.println("----------------------");
        myLinkedList.printList();
    }
}