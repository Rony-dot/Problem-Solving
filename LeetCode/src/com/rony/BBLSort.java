package com.rony;
// Java program to sort a doubly linked list using
// bubble sort
class GFG
{

    static class Node
    {
        double data;
        Node prev;
        Node next;
    };

    static Node insertAtTheBegin( Node start_ref, double data)
    {
        Node ptr1 = new Node();
        ptr1.data = data;
        ptr1.next = start_ref;
        if (start_ref != null)
            (start_ref).prev = ptr1;
        start_ref = ptr1;
        return start_ref;
    }
    static void printList( Node start)
    {
        Node temp = start;
        System.out.println();
        while (temp != null)
        {
            System.out.print( temp.data + " ");
            temp = temp.next;
        }
    }

    static Node bubbleSort( Node start)
    {
        double swapped, i;
        Node ptr1;
        Node lptr = null;
        if (start == null)
            return null;

        do
        {
            swapped = 0;
            ptr1 = start;

            while (ptr1.next != lptr)
            {
                if (ptr1.data > ptr1.next.data)
                {
                    double t = ptr1.data;
                    ptr1.data = ptr1.next.data;
                    ptr1.next.data = t;
                    swapped = 1;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        }
        while (swapped != 0);
        return start;
    }

    public static void main(String args[])
    {
        double arr[] = {12.4, 56.2, 2.11, 11.2, 1.3, 90.1};
        int list_size, i;
        Node start = null;
        for (i = 0; i < 6; i++)
            start=insertAtTheBegin(start, arr[i]);

        System.out.printf("\n Linked list before sorting ");
        printList(start);
        start = bubbleSort(start);
        System.out.printf("\n Linked list after sorting ");
        printList(start);
    }
}

// This code is contributed by Arnab Kundu
