package org.example;

public class Calculator {
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }

    public void negativenumber(int a)
    {
        if(a<0)
        {
            throw new IllegalArgumentException("the number is negative");
        }
    }
}
