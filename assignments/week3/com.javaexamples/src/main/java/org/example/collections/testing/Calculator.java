package org.example.collections.testing;

public class Calculator {

public int addNumbers(int a, int b){
    return a+b;
}

    public int subtractNumbers(int a, int b){
        return a-b;
    }
    public int multiplyNumbers(int a, int b){
        return a*b;
    }
    public int division(int a, int b) throws DivideByZeroException{
        //I'm not entirely sure what went wrong
        if (b == 0){
            throw new DivideByZeroException("You cannot divide by zero");

        } else {
            return a/b;
        }
    }

    //The previous method didn't run because the arith exception was divided by a float

    public int divideInt(int a, int b){
    return a/b;
    }
}
