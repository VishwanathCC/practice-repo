package com.vishu.LinkedList;

public class DLL {

    private Node head;
//    Node tail;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }


    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
