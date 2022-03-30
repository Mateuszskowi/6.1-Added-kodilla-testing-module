package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        int result1 = calculator.add(1,2);
        int result2= calculator.subtract(3,4);

        if((result1 == 3) && (result2 == -1)){
            System.out.println("Calculator is ok");
        } else{
            System.out.println("Calculator is not ok");
        }


        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
    }
}