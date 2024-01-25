import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Employee employee1 = new Employee("Miras", "Askarov", "Manager", 32045.73);
        Employee employee2 = new Employee("Ansar", "Muratov", "Developer", 60000.00);
        Student student1 = new Student("Argiza", "Yerzhanova", 0.00);
        Student student2 = new Student("Sergey", "Stasov", 36660.00);

        people.add(student1);
        people.add(employee1);
        people.add(student2);
        people.add(employee2);


        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
