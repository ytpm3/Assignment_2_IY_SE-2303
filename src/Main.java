import java.util.ArrayList;
import java.util.Collections;
public class main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Miras", "Askarov", "Manager", 25000.00);
        Employee employee2 = new Employee("Ansar", "Muratov", "Developer", 50000.00);
        Student student1 = new Student("Argiza", "Yerzhanova", 3.50);
        Student student2 = new Student("Sergey", "Stasov", 2.20);

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(employee1);
        peopleList.add(employee2);
        peopleList.add(student1);
        peopleList.add(student2);



        Collections.sort(peopleList);

        printData(peopleList);
    }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.printf("%s earns %.2f tenge%n", person, person.getPaymentAmount());
        }
    }
}
