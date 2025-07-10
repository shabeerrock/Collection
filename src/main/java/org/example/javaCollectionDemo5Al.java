package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaCollectionDemo5Al
{
    /*
    Program to check whether the list contains element or not:
    contains() method returns true if the list has specified element
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<Integer>();
        for (int i =10 ;i<=50;i+=10)
            li.add(i);
        System.out.println("The List "+li);
        System.out.println("enter the element contain in List");
        int element = sc.nextInt();
        if(li.contains(element))
            System.out.println("Yes the element is contains");
        else
            System.out.println("No the element is not contains in list");
    }
}
