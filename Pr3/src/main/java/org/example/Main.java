package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("Односвязный список");
        OneLinked list = new OneLinked();
        int size = (int)(Math.random() * (10-5)) + 5;
        for (int i = 0; i < size; i++)
            list.addItem((int)(Math.random() * (99-10)) + 10);

        for (int i = 0; i < list.getsize(); i++)
            System.out.print(list.getItem(i) + " ");
        System.out.println();

        list.reverse();
        for (int i = 0; i < list.getsize(); i++)
            System.out.print(list.getItem(i) + " ");
        System.out.println();

        System.out.println();

        System.out.println("Двусвязный список");
        DoubleLinked listD = new DoubleLinked();
        size = (int)(Math.random() * (10-5)) + 5;
        for (int i = 0; i < size; i++)
            listD.addFirst((int)(Math.random() * (99-10)) + 10);

        for (int i = 0; i < listD.getsize(); i++)
            System.out.print(listD.getItem(i) + " ");
        System.out.println();

        listD.reverse();
        for (int i = 0; i < listD.getsize(); i++)
            System.out.print(listD.getItem(i) + " ");

    }
}