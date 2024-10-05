package StreamAPi_JAVA;

import StreamAPi_JAVA.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StreanAPI_InterviewQ {

        public static void main(String[] args) throws ParseException {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
                Date joiningDateChandu = dateFormat.parse("12-12-2024");
                Date joiningDateSandhya = dateFormat.parse("06-11-1994");
                Date joiningDateBharath = dateFormat.parse("28-03-1964");

                List<Employee> empList = Arrays.asList(
                                new Employee("Chandu", 100000.0, joiningDateChandu, "male"),
                                new Employee("Sandhya", 600000.0, joiningDateSandhya, "Female"),
                                new Employee("Bharath", 200000.0, joiningDateBharath, "Male"));

                // 1.Whats the employees highest salary
                Employee highsalary = empList.stream()
                                .max((a, b) -> Double.compare(a.getSalary(), b.getSalary()))
                                .get();

                System.out.println(highsalary);

                // 2.Second Highest salary
                Employee secondHighestSal = empList.stream()
                                .sorted((a, b) -> Double.compare(a.getSalary(), b.getSalary()))
                                .skip(1)
                                .findFirst()
                                .get();
                System.out.println(secondHighestSal);

                // senior Employee Based on joining date

                Optional<Employee> seniorEmployee = empList.stream()
                                // by comparable
                                // .min((a, b) -> a.getJoiningDate().compareTo(b.getJoiningDate()));

                                // by comparator
                                .min(Comparator.comparing(Employee::getJoiningDate));

                System.out.println(seniorEmployee);

        }

}
