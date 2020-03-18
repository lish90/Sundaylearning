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
    public void stringTwoNumbersOneAddTwoReturnThree(){
        //Arrange
        StringCalculator stringCalculator = new StringCalculator();
        //  Act
        int result = stringCalculator.add("1,2");
        //Assert
        Assert.assertEquals(3,result);
    }
    @Test
    public void stringArbitrarynumberSize() {
        //Arrange
        StringCalculator stringCalculator = new StringCalculator();
        //  Act
        int result = stringCalculator.add("1,2,3,4,5,6,7,8,9");
        //Assert
        Assert.assertEquals(45, result);

    }

}
