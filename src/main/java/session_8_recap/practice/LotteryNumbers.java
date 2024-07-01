package session_8_recap.practice;

import java.util.Arrays;
import java.util.Random;

public class LotteryNumbers {

    public static void main(String[] args) {
        generateRandomNumber();
        Arrays.toString(generateRandomNumber());
    }

    public static int[] generateRandomNumber() {

        int[] array = new int[6];
        for (int index = 0; index <= 5; index++) {
            Random random = new Random();
            array[index] = random.nextInt(1, 50);
        }
        return array;
    }
}
