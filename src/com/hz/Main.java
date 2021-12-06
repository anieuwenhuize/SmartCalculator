package com.hz;

public class Main {

    public static void main(String[] args) {
	// write your code here


        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        Calculator calculator = null;

        while(true) {

            // +, -, *,
            // first detect mode
            writer.write("Please insert mode: '+' for addition,'-' for subtraction");
            String mode = reader.readLine();

            if(mode.equals("+")) {
                calculator = new AddCalculator();
            }
            else if (mode.equals("-")) {
                calculator = new SubCalculator();
            }

            // then accept first number
            writer.write("Please insert first number...");
            String firstNum = reader.readLine();
            calculator.setNumberOne(Integer.parseInt(firstNum));

            // then accept second number
            writer.write("Please insert second number...");
            String secondNum = reader.readLine();
            calculator.setNumberTwo(Integer.parseInt(secondNum));

            // calculate the result
            writer.write("And the answer is... ");
            int result = calculator.getResult();
            writer.write(result + "");

        }
    }
}
