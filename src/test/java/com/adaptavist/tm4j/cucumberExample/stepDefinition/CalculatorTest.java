package com.adaptavist.tm4j.cucumberExample.stepDefinition;

import com.adaptavist.tm4j.cucumberExample.calculator.Calculator;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class CalculatorTest {
    private Calculator c;

    @Given("^a calculator I just turned on$")
    public void aCalculatorIJustTurnedOn() {
       c = new Calculator();
    }

    @And("^I subtract (\\d+) and (\\d+) and the result is (\\d+)$")
    public void numbersAreSubtracted(long number1, long number2, int result) {
    	System.out.println("Difference of "+number1+ "and" +number2+ "is " +c.subtract(number1, number2));
        //assertEquals(result, c.subtract(number1, number2));
    }

    @And("^I multiply (\\d+) and (\\d+) and the result is (\\d+)$")
    public void numbersAreMultiplied(long number1, long number2, int result) {
    	System.out.println("Multiplication of "+number1+ "and" +number2+ "is " +c.multiply(number1, number2));
        //assertEquals(result, c.multiply(number1, number2));
    }

    @Then("^I sum (\\d+) and (\\d+) and the result is (\\d+)$")
    public void numbersAreSummedUp(int number1, int number2, int result) {
    	System.out.println("Sum of "+number1+ "and" +number2+ "is " +c.sum(number1, number2));
        //assertEquals(result, c.sum(number1, number2));
    }
}
