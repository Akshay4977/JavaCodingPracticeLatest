package com.example.javacodingpracticelatest.dsa;

import android.util.Log;

public class TreeDSACodePractice {





    Node root = null;
    public int[] plusOne(int[] digits) {

        String b = "";
        for (int i = 0; i < digits.length; i++) {
            b = b + digits[i]; // each digit of integer is put into string
        }

        long val = Long.parseLong(b) + 1; //string is converted to integer and added 1

        int[] a = new int[Long.toString(val).length()]; // created array with size of value
        int pos = Long.toString(val).length() - 1; //pos value is set to length of result array
        while (val > 0) {
            int digit = (int) (val % 10); // value mod added to digit
            a[pos] = digit; // digit is added at pos
            val = val / 10;
            pos--; // decrement of pos
        }

        return a; //this result value even work case when you give input array as a {9,9,9}
    }


    void start(){
        int[] a = {9,8,7,6,5,4,3,2,1,0};
        int[] b = plusOne(a);
        for (int i = 0; i < b.length; i++) {
            //   Log.e("inside", "" + b[i]);
        }


        /*Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        binaryTree(root);*/

        insert(5);
        insert(7);
        insert(2);
        insert(4);
        binaryTree(root);
    }

    void binaryTree(Node root){

        if(root != null){
            if(root.left != null){
                binaryTree(root.left);
            }

            Log.e("inside"," "+root.data );
            if(root.right != null){
                binaryTree(root.right);
            }
        }
    }

    public class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public void insert(int data) {

        //Create a new node
        Node newNode = new Node(data);

        //Check whether tree is empty
        if(root == null){
            root = newNode;
            return;
        }
        else {
            //current node point to root of the tree
            Node current = root, parent = null;

            while(true) {
                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if(data < current.data) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
                else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

}
