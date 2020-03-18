package org.example.stringcalculator;

public class StringCalculator {

    public int add(String number) {
        if (number.equals("")) {
            return 0;
        }
        int total = 0;

        String[] arraySplit = number.split(",");
        for (int i = 0; i < arraySplit.length; i++) {

           total += Integer.parseInt(arraySplit[i]);
        }
        return total;
    }
}

