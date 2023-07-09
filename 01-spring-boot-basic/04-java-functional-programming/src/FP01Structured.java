import java.util.List;

public class FP01Structured {
    public static void main(String[] args){
        printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("==========================================");
        printEvenNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        for (int num : integers) {
            System.out.println(num);
        }

    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for(int num : numbers){
            if(num % 2== 0) {
                System.out.println(num);
            }
        }
    }

}
