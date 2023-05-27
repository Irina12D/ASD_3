package org.example;

public class DoubleLinked {
    private Node2D head;
    private Node2D tail;
    private int size = 0;


    public void addFirst(int value) {
        Node2D newNode = new Node2D();
        newNode.value = value;
        newNode.next = head;
        if (size != 0) {
            head.prev = newNode;
        }
        if (tail == null)
            tail = newNode;
        head = newNode;
        size++;
    }

    public void addLast(int value) {
        Node2D newNode = new Node2D();
        newNode.value = value;
        newNode.prev = tail;
        if (tail != null)
            tail.next = newNode;
        tail = newNode;
        if (head == null)
            head = newNode;
        size++;
    }

    public void removeFirst() {
        if (head != null) {
            if (head == tail)
                tail = null;
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (tail != null) {
            if (head == tail)
                head = null;
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public int getsize() {
        return size;
    }

    public int getItem(int index) {
        if (index > size)
            throw new ArrayIndexOutOfBoundsException();
        Node2D temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp.value;
    }

    public void reverse() {
        Node2D currentNode = head;
        Node2D temp = new Node2D();

        while (currentNode != null) {
            temp = currentNode.next;
            currentNode.next = currentNode.prev;
            if (temp != null) {
                currentNode.prev = temp;
                currentNode = temp;
            } else {
                currentNode.prev = null;
                currentNode = null;
            }
        }
        temp = head;
        head = tail;
        tail = temp;
    }
}

    class Node2D{
        public int value;
        Node2D next;
        Node2D prev;
    }



