package com.vishu.LinkedList;

import java.util.LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){
        if (index == 0)
            insertFirst(value);
        if (index == size)
            insertLast(value);

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = new Node(value, temp.next);
        size++;
    }

    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }

    public Node insertRec(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertRec(value, --index, node.next);
        return node;
    }

    public void delete(int index){
        if(index >= size){
            System.out.println("index value exceeding size");
            return;
        }else if(index == size-1){
            deleteLast();
        }
        else{
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public void deleteFirst(){
        head = head.next;
        if (head == null){
            tail = head;
        }
        size--;
    }

    public void deleteLast(){
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }


    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
//        LinkedList lk = new LinkedList();
//        lk.add(9);
//        lk.add(34);
//        lk.set(1,67);
//        System.out.println(lk);
//        System.out.println(lk.getFirst());
//        System.out.println(lk.getLast());

        LL kl = new LL();
        kl.insertFirst(34);
        kl.insertFirst(38);
        kl.insertFirst(32);
        kl.insertFirst(98);
        kl.insertLast(82);
        kl.insert(55, 2);
        kl.display();
        kl.insertRec(7,3);
        kl.display();

//
//        kl.deleteFirst();
//        kl.deleteLast();
//        kl.display();
//
//        kl.delete(4);
//
//        kl.display();

//        DLL th = new DLL();
//        th.insertFirst(45);
//        th.insertFirst(23);
//        th.insertFirst(47);
//        th.insertFirst(75);
//        th.display();

//        CLL id = new CLL();
//        id.insert(33);
//        id.insert(34);
//        id.insert(98);
//        id.insert(76);
//        id.display();

    }
}
