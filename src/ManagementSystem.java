import java.util.ArrayList;

public class ManagementSystem {

    // Encapsulation
    private ArrayList<Person> people = new ArrayList<>();

    // Add person
    public void addPerson(Person person) {
        people.add(person);
    }

    // Display all people
    public void displayAllPeople() {

        if(people.isEmpty()) {
            System.out.println("No registered people found.");
            return;
        }

        for(Person person : people) {

            // Runtime Polymorphism
            person.displayInfo();

            System.out.println();
        }
    }

    // Search person by name
    public void searchPerson(String name) {

        boolean found = false;

        for(Person person : people) {

            if(person.getName().equalsIgnoreCase(name)) {

                person.displayInfo();

                found = true;
            }
        }

        if(!found) {
            System.out.println("Person not found.");
        }
    }

    // Delete person by name
    public void deletePerson(String name) {

        boolean removed = people.removeIf(person ->
                person.getName().equalsIgnoreCase(name));

        if(removed) {
            System.out.println("Person deleted successfully!");
        } else {
            System.out.println("Person not found.");
        }
    }
}