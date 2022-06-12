package controlflow.core;

public class DiagonalStar {
    
    public static void main(String[] args) {
        printSquareStar(21);
    }

    public static void printSquareStar(int number) {

        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            // rows
            for(int i = 0; i < number; i++) {

                // columns
                for(int j = 0; j < number; j++) {

                    // check for the conditions
                    // i = 0 refers to first row & j = 0 refers to first column
                    // since we start from index 0, number - 1 will be last row/column
                    if (i == 0 || j == 0 || i == number - 1 || j == number - 1 || i == j || j == number - (i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // after we run out of columns, we will go to the next row by creating next line. 
                System.out.println();
            }
        }
    }
}
