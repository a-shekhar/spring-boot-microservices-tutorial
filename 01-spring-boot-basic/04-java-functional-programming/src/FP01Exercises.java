import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {

        printOddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("==========================");
        printAllCoursesInListFunctional(List.of("AWS", "GCP", "Azure",
                "Spring", "Spring Boot", "Microservices", "Docker"));
        System.out.println("==========================");
        printSpringCoursesInListFunctional(List.of("AWS", "GCP", "Azure",
                "Spring", "Spring Boot", "Microservices", "Docker"));
        System.out.println("==========================");
        printFilterdCoursesInListFunctional(List.of("AWS", "GCP", "Azure",
                "Spring", "Spring Boot", "Microservices", "Docker"));
        System.out.println("==========================");
        printCharsInCoursesInListFunctional(List.of("AWS", "GCP", "Azure",
                "Spring", "Spring Boot", "Microservices", "Docker"));
    }

    private static void printCharsInCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

    private static void printSpringCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printFilterdCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printAllCoursesInListFunctional(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);

    }
}
