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

//    Ets Andy09:27
//        const numbers = numberString.replace( /\n/g, "," ).split(",");
//        that is what i used to replace the new line with comma
//        Ets Andy09:44
//        just console log it will appear when you run the tests
//        Dionne Condor-Farrell09:45
//        Is it adding an empty string in the first array element, and trying to convert that to a number which fails?
//        That's happening in my java version
//        I'm solving it by starting the for loop with index = 1
//        Dionne Condor-Farrell09:46
//        My java version
//
//public int add(String numbers) {
//
//        if (numbers.equals("")) {
//
//        return 0;
//        }
//
//        String numberString = numbers.replace('\n',',');
//
//        if(numberString.startsWith("//")) {
//        numberString = numberString.substring(3);
//        }
//
//        System.out.println(numberString);
//
//        String[] arraySplit = numberString.split("[\n , ;]");
//
//        if (arraySplit.length == 1) {
//        return Integer.valueOf(arraySplit[0]);
//        }
//
//
//        Dionne Condor-Farrell09:49
//        Sorry the copy and paste is missing some code
//        Dionne Condor-Farrell09:51
//        The rest of the java code...
//
//
//        int total = 0;
//
//        for (int i = 1; i < arraySplit.length; i++) {
//        int item = Integer.valueOf(arraySplit[i]);
//        total += item;
//        }
//
//        return total;
//        Steve Lydford09:51
//        https://stackoverflow.com/questions/10136097/mystring-replace-variable-but-globally/10136142
//        Steve Lydford09:57
//        http://jsfiddle.net/c9eL8j24/
//        var separator = ";";
//        var regex = new RegExp(separator, "g");
//
//        var input = "1;2";
//        var output = input.replace(regex, ",");
//        alert(output);
//        Bola Ajose10:02
//        if (numberString.startsWith("//")) {
//        // let seperator = numberString.substring(2, 3);
//        var separator = ";";
//        var reg = new RegExp(separator, "g");
//        numberString.replace(reg, ",");
//        numberString = numberString.substring(3);
//        console.log(numberString);
//        }
//        Barbie Barbara10:03
//        Hello all, this was a good session. I need to drop off to finish some other project due for review. May I please reach out to you in our Whatsapp to know the next session.
//        Dionne Condor-Farrell10:06
//        I have to go to work guys, see you online next Wednesday