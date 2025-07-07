package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo1
{
//    Program to display ArrayList and its size:
//        • add() method is	used to append element to the list.
//        * size() method returns the length of list.
//Program to check the list is empty or not:
//        • isEmpty() method returns true if the list doesn’t contains elements else returns false
//Program to display the element of specified index:
//        • get(int index) returns the element of	specified index.
public static void main(String[] args)
{
    List<String> ar = new ArrayList<>() ;
    ar.add("shabeer");
    ar.add("sam");
    ar.add("shahul");
    ar.add("gopi");
    System.out.println (ar);
    System.out.println (ar.size());
    if(ar.isEmpty())
        System.out.println("yes list is empty");
    else
        System.out.println("list is not empty");

    System.out.println(ar.get(2));

    /// ----------------------------------------------------------------------------------------
    List<Integer> nums =  new ArrayList<>();
    System.out.println("");
    Scanner sc = new Scanner(System.in);
    for (int i =10 ;i <=50;i+=10)
        nums.add(i);
    System.out.println("the List"+nums);
    System.out.println("enter the index  wanna to show");
    int gc = sc.nextInt();
    //We specify the error message – if the index value is not present:
   /* if(gc>=-0 && gc <= nums.size()-1)
        System.out.println("Element @ the Index "+ nums.get(gc));
    else
        System.out.println("Invalid list ");

    */
    try
    {
        System.out.println("Element @ the Index "+ nums.get(gc));
    }catch (Exception c)
    {
        System.out.println("invalid ");
        c.getStackTrace();
    }

}

}
