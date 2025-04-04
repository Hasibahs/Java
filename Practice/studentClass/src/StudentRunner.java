import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

        int[] marks = {97,98,100};
        Student student = new Student("Range", marks);

        int number = student.getNumberOfMarks();
        System.out.println("Number of Marks : "+ number );

        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks: "+ sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum mark is: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum mark is : "+ minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("average: "+ average);

    }
}