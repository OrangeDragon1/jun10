package controlflow.core;

public class NTWSolution {

    public static void main(String[] args) {
        
        numberToWords(1000);
    }

    public static void numberToWords(int number) {
        int digitCount = getDigitCount(number);
        // number = reverse(number);
        int revNum = reverse(number); // don't mutate parameter
        // int revDigitCount = getDigitCount(number);
        // int zeroCount = digitCount - revDigitCount;
        // int pickNum = 0;
        String words = "";
 
        if(number < 0) {
            System.out.println("Invalid Value");
        }
 
        // if(number == 0) {
        //     words += " Zero";
        // }
 
        // while(number != 0) {
        while(digitCount > 0) {
            digitCount--;
            // pickNum = number % 10;
            int pickNum = revNum % 10; // most narrow scope!
            switch (pickNum) {
                case 1:
                    words += " One";
                    break;
                case 2:
                    words += " Two";
                    break;
                case 3:
                    words += " Three";
                    break;
                case 4:
                    words += " Four";
                    break;                                
                case 5:
                    words += " Five";
                    break;
                case 6:
                    words += " Six";
                    break;
                case 7:
                    words += " Seven";
                    break;
                case 8:
                    words += " Eight";
                    break;
                case 9:
                    words += " Nine";
                    break;
                case 0:
                    words += " Zero";
                    break;                       
                default:
                    break;
            }
            // number /= 10;
            revNum /= 10;
        }
 
        // for(int i = 0; i < zeroCount; i++) {
        //     words += " Zero";
        // }
 
        System.out.println(words.trim());
    }
 
    public static int reverse(int number) {
 
        int reverseNum = 0;
 
        while(number != 0) {
            // reverseNum *= 10;
            // reverseNum += (number % 10);
            reverseNum = reverseNum*10 + number%10; // combine
            number /= 10;
        }
 
        return reverseNum;
    }
 
    public static int getDigitCount(int number) {
 
        int digitCount = 0;
 
        if(number < 0) {
            return -1;
        }
 
        // if(number == 0) {
        //     digitCount = 1;
        // }
 
        // while(number != 0) {
        do {
            number /= 10;
            digitCount++;
        // }
        } while (number > 0);
        return digitCount;
    }
    
}
