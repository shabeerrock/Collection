package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaCollectionDemo6Al
{
    /*
        Program display the index value of element: indexOf() method returns index of specified element.
        It returns -1 if no such element in the list.
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<Integer>();
        for(int i =10 ;i<=50;i+=10)
            li.add(i);
        System.out.println("The List is "+li);
        System.out.println("Enter the element in the List");
        int ind = sc.nextInt();
        int index = li.indexOf(ind);
        if(index != -1)
            System.out.println("the element of index is "+ index);
        else
            System.out.println("the element not in next ");
    }
}
