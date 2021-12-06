package com.hz;

public abstract class Calculator {

    private int numberOne;
    private int numberTwo;

    public void setNumberOne(int number){
        this.numberOne = number;
    }
    public void setNumberTwo(int number){
        this.numberTwo = number;
    }

    public int getResult() {

        int result = this.Process(this.numberOne, this.numberTwo);

        return result;
    }

    public abstract int Process(int numberOne, int numberTwo);
}
