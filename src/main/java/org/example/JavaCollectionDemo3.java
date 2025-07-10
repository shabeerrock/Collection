package org.example;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionDemo3
{
//    Program to remove all elements from the list: clear() method removes all elements from the list.
//    Instructions to code:
//          Create list with 5 elements.
//          Display – List is not empty
//          Remove all elements using clear() method
//          Display – List is empty.
    public static void main(String[] args)
    {
        List<Integer> li = new ArrayList<Integer>();
        for(int i =10 ; i<=50 ;i+=10)
        {
            li.add(i);
            //System.out.println(i);
        }
        System.out.println("List is : " + li);
        if(li.isEmpty())
        {

            System.out.println("list is empty");

        }
        else
        {
            System.out.println("list is not empty");
            li.clear();
        }
        if(li.isEmpty())
            System.out.println("List is empty"+li);
        else
            System.out.println("list is not empty "+li);

    }
}
