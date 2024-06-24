package session_6_java_core_apis.challenges;
// Concatenate Multiple Strings
// Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.

public class Challenge6_3 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Vacation tour this year is: ");
        sb.append(" Paris");
        sb.append(" Milano");
        sb.append(" Madrid");
        sb.append(" Cairo");
        sb.append(" Pretoria");
        sb.append(" Antananarivo");
        String concat = sb.toString();

        System.out.println("The result of the concatenated Strings: " + concat);

    }
}
