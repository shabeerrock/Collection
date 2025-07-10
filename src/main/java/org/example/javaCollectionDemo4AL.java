package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaCollectionDemo4AL
{ /*
    Program to remove index element: remove(int index) method removes element of specified index.
Instructions to code:
•	Create list with elements
•	Read index value.
•	If the index is valid – remove the element and display list
    If the index is not valid – display error message
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<Integer>();
        for (int i =10 ;i<=50 ;i+=10)
            li.add(i);
        System.out.println("the list is "+li);
        System.out.println("Enter the index need to remove");
        int ind = sc.nextInt();
        if(ind > 0 && ind<=li.size()-1) {
            System.out.println(" this is valid index");
            li.remove(ind);
            System.out.println("The List"+li);
        }else
            System.out.println(" the index is invalid ");

    }
}
