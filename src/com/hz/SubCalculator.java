package com.hz;

public class SubCalculator extends Calculator {
    @Override
    public int Process(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
}