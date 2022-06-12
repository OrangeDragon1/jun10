package controlflow.core;

public class LargestPrime {

    public static void main(String[] args) {
        
        // System.out.println(getLargestPrime(21));
        getLargestPrime(0);
        // int number = 11;
        // double count = 1.0;
        // count++;
        // boolean result = number/count == 1.0;
        // double resultNum = number/count;

        // System.out.println(result);
        // System.out.println(resultNum);
    }
    
    public static void getLargestPrime(int number) {

        int primeNum = -1;
        int count = 1;
        int countPrime = 1;

        if(number > 1) {
            while(count < number) {
                if(number % count == 0) {
                    while(countPrime < count) {
                        
                    }
                }
                count++;
            }
        }
        System.out.println(primeNum);
    }
}
