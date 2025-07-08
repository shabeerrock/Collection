package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaCollectionDemo2
{
//    Insert element into specified index: add(int index, E e) method is used to insert element into specified index.
//    Instructions to code:
//        •	Create ArrayList with 5 elements 10, 20, 30, 40, 50
//        •	Read index to insert.
//        •	Check whether the index is present or not
//	    If the index is present, then read the value and insert
//      If the index is not present, display Error message.
    public static void main(String[] args)
    {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        System.out.println("List : "+li);
        System.out.println("Enter the index to replace");
        Scanner sc = new Scanner(System.in);
        int gc = sc.nextInt();
         if(gc>=0 && gc <=li.size()-1)
         {
             System.out.println("valid index");
             System.out.println("enter number to replace");
             int num = sc.nextInt();
             li.add(gc, num);
             System.out.println("the list is :" + li);
         }
         else {
             System.out.println("invalid index");
         }
    }
}
