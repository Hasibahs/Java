import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {97,98,100};
        Student student = new Student("Hasib", marks);

        int number = student.getNumberOfMarks();
        System.out.println("number of marks : " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks : "+ sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("maximum of marks: "+ maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("minimum of marks: "+ minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("average : "+ average);

    }
}
