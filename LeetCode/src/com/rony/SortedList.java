package com.rony;

import java.util.List;

class SortList {

    class Node{
        double data;
        Node previous;
        Node next;

        public Node(double data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void addNode(double data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
//    public void sortList2(List<Node> lists) {
//        SortList.Node current = null, index = null;
//        double temp;
//        if(head == null) {
//            return;
//        }
//        else {
//
//            for(current = head; current.next != null; current = current.next) {
//
//                for(index = current.next; index != null; index = index.next) {
//                    if(current.data > index.data) {
//                        temp = current.data;
//                        current.data = index.data;
//                        index.data = temp;
//                    }
//                }
//            }
//        }
//    }

    public void sortList() {
        Node current = null, index = null;
        double temp;
        if(head == null) {
            return;
        }
        else {

            for(current = head; current.next != null; current = current.next) {

                for(index = current.next; index != null; index = index.next) {
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        }
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SortList dList = new SortList();
        //Add nodes to the list
        dList.addNode((double)1/2);
        dList.addNode((double)2/3);
        dList.addNode((double)4/7);

        System.out.println("Original list: ");
        dList.display();

        dList.sortList();

        System.out.println("Sorted list: ");
        dList.display();
    }
}
