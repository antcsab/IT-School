package session_6_java_core_apis.practice;

public class StringBuilderPractice {

    public static void main(String[] args) {
        String result = "";
        //result aaaaaaaa
        for (int index = 0; index < 10; index++) {
            result += "a";
        }
        System.out.println(result);
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            sb.append("a");
        }
        String result2 = sb.toString();
        System.out.println("With String Builder" + result2);
    }
}
