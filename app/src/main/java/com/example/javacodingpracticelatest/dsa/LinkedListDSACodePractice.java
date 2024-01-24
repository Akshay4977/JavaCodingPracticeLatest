package com.example.javacodingpracticelatest.dsa;

import android.util.Log;

public class LinkedListDSACodePractice {


    Node head;

    LinkedListDSACodePractice insert(LinkedListDSACodePractice list, int data) {
        Node newNode = new Node(data);


        if (list.head == null) {
            list.head = newNode;
        } else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
        return list;
    }

    void print(LinkedListDSACodePractice list) {
        Node current = list.head;
        while (current != null) {
            Log.e("inside", "-->" + current.data);
            current = current.next;

        }
    }

    public void start() {
        LinkedListDSACodePractice list = new LinkedListDSACodePractice();
        list = insert(list, 12);
        list = insert(list, 21);
        list = insert(list, 22);

        print(list);

    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
