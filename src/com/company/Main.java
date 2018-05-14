package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
	List<Circle> myCircles = new ArrayList<>();
	myCircles.add( new Circle(10));
	myCircles.add(new Circle(15));
	myCircles.add(new Circle(7));
	myCircles.add(new Circle(3));
        System.out.println("unsorted list");
	printList(myCircles);
        System.out.println("sorted list");
	Collections.sort(myCircles);
	printList(myCircles);
    }
    private static  void printList(List<Circle> circles)
    {
        for (Circle circle:circles)
        {
            System.out.println(circle.getDiameter());
        }
    }
}
