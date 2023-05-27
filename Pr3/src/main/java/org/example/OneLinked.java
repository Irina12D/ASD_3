package org.example;

public class OneLinked {
    private Node head;
    private int size = 0;


    public void addItem(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public void removeItem() {
        if (head != null)
            head = head.next;
        size--;
    }

    public int getsize() {
        return size;
    }

    public int getItem(int index){
        if (index > size)
            throw new ArrayIndexOutOfBoundsException();
        Node temp = head;
        while(index > 0){
             temp = temp.next;
             index--;
        }
        return temp.value;
    }

    public void reverse(){
        Node temp = head;
        Node prevNode = null;
        Node nextNode = null;

        while(temp!=null)
        {
            nextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = nextNode;
        }
        head = prevNode;
    }
}

class Node{
    public int value;
    public Node next;
}
