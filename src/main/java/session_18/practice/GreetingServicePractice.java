package session_18.practice;

public class GreetingServicePractice {

    public static void main(String[] args) {

        //using anonymus class
        GreetingService anonymousGreetingService = new GreetingService() {

            @Override
            public void greet(String message) {
                System.out.println(message + "Hello World from anonymous class");
            }
        };

        anonymousGreetingService.greet("Hello world ");

        //using Lambda expression
        GreetingService lambdaGreetingService = input -> System.out.println(input + "From lambda expression");
        lambdaGreetingService.greet("Hello world ");
    }
}
