public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Vet theVet = new Vet(zoo);
        System.out.println(zoo.getName());
        new Animal("Pinky", "Panther", 5, 7, 9, 10000, zoo);
        new Animal("Pandy", "Panda", 6, 3, 15, 5000, zoo);
        new Animal("Koaly", "Koala", 3, 11, 7, 7500, zoo);
        zoo.addEmployee(new Employee("Peter", zoo));
        zoo.addEmployee(new Employee("Irati", zoo));
        zoo.addEmployee(new Employee("Chris", zoo));

        UserInterface userInterface = new UserInterface(zoo, theVet);

    }
}
