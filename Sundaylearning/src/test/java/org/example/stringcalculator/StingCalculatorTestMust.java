package org.example.stringcalculator;

import org.junit.Assert;
import org.junit.Test;

public class StingCalculatorTestMust {
    @Test
    public void emptyInputReturnZero() {

    // arrange
        StringCalculator stringCalculator = new StringCalculator();
    //  Act
        int result = stringCalculator.add("");
    // Assert
        Assert.assertEquals(0,result);
    }

    @Test
    public void stringFourToReturnIntFour(){
    //Arrange
        StringCalculator stringCalculator = new StringCalculator();
    //  Act
        int result = stringCalculator.add("4");
    //Assert
        Assert.assertEquals(4,result);
    }
    @Test
    public void stringEightToReturnIntEight(){
        //Arrange
        StringCalculator stringCalculator = new StringCalculator();
        //  Act
        int result = stringCalculator.add("8");
        //Assert
        Assert.assertEquals(8,result);
    }
    @Test
    public void stingAddingTwoNumberReturnThree(){
        //Arrange
        StringCalculator stringCalculator = new StringCalculator();
        //  Act
        int result = stringCalculator.add("8");
        //Assert
        Assert.assertEquals(8,result);
    }
}
