package Operators;

public class MathOperators {

    public static double add(double a , double b){

        return a + b;
    }

    public static double substract(double a , double b){

        if(a > b){
            return a-b;
        }
        else{
            return b-a ;
        }
    }

    public static double multiply(double a , double b){

        return a * b;
    }

    public static double divide(double a , double b){

        return a / b;
    }

}

