package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaCollectionDemo7AL
{
/*
    Program to replace the existing value: set(int index, E e) method replace the index element with specified element.
Instructions to code:
•	Create ArrayList with elements.
•	Read the element to replace
•	Check the element is present or not in the list using contains() method.
•	If the element is present,
o	    Read the new element to replace with.
•	If the element is not present,
o	    Display error message.
*/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<Integer>();
        for (int i =10 ;i<=50;i+=10)
            li.add(i);
        System.out.println("the LIst of element "+li);
        System.out.println("enter the element to replace");
        int replaceElement = sc.nextInt();
        if (li.contains(replaceElement))
        {
            int getIndex = li.indexOf(replaceElement);
            System.out.println("Enter the new element ");
            int newElement = sc.nextInt();
            li.set(getIndex,newElement);
            System.out.println("The New List "+li);
        }
        else
        {
            System.out.println("The Element is not Present ");
        }

    }
}
