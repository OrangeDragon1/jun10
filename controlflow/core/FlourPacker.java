package controlflow.core;

public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        boolean isPack = false;

        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            if (((bigCount * 5) + smallCount) >= goal) {
                while (goal > 0) {
                    while (bigCount != 0) {
                        bigCount--;
                        if ((goal -5) >= 0)
                            goal -= 5;
                        if (goal <= 0)
                            break;
                    }
                    if (goal != 0) {
                        while (smallCount != 0) {
                            smallCount--;
                            goal -= 1;
                            if (goal <= 0)
                                break;
                        }
                    }
                    if ((bigCount == 0) || (smallCount == 0))
                        break;
                }
                if (goal == 0) {
                    isPack = true;
                }
            }
        }

        return isPack;
    }
}
