package session_3_java_operators;

public class NumericPromotion {
    public static void main(String[] args) {
        short e = 10;
        int f = e + 5;

        long a = 1000000000000L;
        //wrapper classes
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println(" Max long value: " + maxLongValue);
        System.out.println(" Min long value: " + minLongValue);
        System.out.println(" Max integer value: " + maxIntValue);

        long testLongValue = 1212133242235L;
        int newIntValue = (int) testLongValue;
    }
}
