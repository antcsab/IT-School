package session_18.practice;

import java.util.List;

public class NegativeFilterPracitce {

    public static void main(String[] args) {

        NegativeFilter negativeFilter = numbers -> numbers.stream()
                .filter(num -> num < 0)
                .toList();

        List<Integer> numbers = List.of(-1, 3, -5, 9);
        System.out.println(negativeFilter.filter(numbers));
    }
}
