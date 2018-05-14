package com.company;

public class Circle implements Comparable<Circle>
{
    private int diameter;
    public Circle (int diameter)
    {
        this.diameter = diameter;
    }

    public int getDiameter()
    {
        return diameter;
    }

    @Override
    public int compareTo(Circle that)
    {

        /*if (this.getDiameter() < that.getDiameter())
        {
            return -1;
        }
       else if (this.getDiameter() > that.getDiameter())
        {
            return 1;
        }
        else
        {
            return 0;
        }*/
        return this.getDiameter() - that.getDiameter();
    }
}
