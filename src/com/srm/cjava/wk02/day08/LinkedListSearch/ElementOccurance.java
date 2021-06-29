package com.srm.cjava.wk02.day08.LinkedListSearch;

public class ElementOccurance {
   
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n=node.next;
            }
            n.next=node;
        }
    }
    public void show(){
        Node node =head;
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

}
