import java.util.List;

public class FP01Functional {
    public static void main(String[] args){

        printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("=================================================");
        printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("=================================================");
        printEvenSquareNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("=================================================");
        printOddCubeNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));


    }

    private static void printOddCubeNumbersInListFunctional(List<Integer> integers) {
        integers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void printEvenSquareNumbersInListFunctional(List<Integer> integers) {

        integers.stream()
                .filter(FP01Functional::isEven)
                .map(number -> number * number)
                .forEach(System.out::println); //method reference
    }

    private static void printAllNumbersInListFunctional(List<Integer> integers) {
       // integers.stream().
       //         forEach(FP01Functional::print); //method reference

        integers.stream().
                 forEach(System.out::println); //method reference
    }


    private static void printEvenNumbersInListFunctional(List<Integer> integers) {

        integers.stream()
        .filter(FP01Functional::isEven)
        .forEach(System.out::println); //method reference
    }

    private static boolean isEven(int number){
        return number%2==0;
    }


    private static void print(Integer num){
        System.out.println(num);
    }

}
