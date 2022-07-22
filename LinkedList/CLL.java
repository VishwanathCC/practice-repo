package com.vishu.LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        head = node;
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }while(temp != head );
        }
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
