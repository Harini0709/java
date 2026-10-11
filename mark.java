
public class Main {
    public static void main(String[] args) {

        String name = "Harini";
        int python = 85;
        int sql = 90;
        int machineLearning = 80;

        int total = python + sql + machineLearning;
        double average = total / 3.0;

        System.out.println("STUDENT MARKS REPORT");
        System.out.println("Name: " + name);
        System.out.println("Python: " + python);
        System.out.println("SQL: " + sql);
        System.out.println("Machine Learning: " + machineLearning);
        System.out.println("Total: " + total + " / 300");
        System.out.println("Average: " + average);

        if (average >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
