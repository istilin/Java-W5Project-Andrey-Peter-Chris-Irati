public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println(zoo.getName());
        new Animal("Pinky", "Panther", 5, 7, 9, 10000, zoo);
        new Animal("Pandy", "Panda", 6, 3, 15, 5000, zoo);
        new Animal("Koaly", "Koala", 3, 11, 7, 7500, zoo);
        new Animal("Koko", "Koala", 3, 11, 7, 7500, zoo);
        zoo.addEmployee(new Employee("Peter", zoo));
        zoo.addEmployee(new Employee("Irati", zoo));
        zoo.addEmployee(new Employee("Chris", zoo));
        zoo.printAllEmployees();
        for (String species: zoo.getAnimalSpecies().keySet()){
            System.out.println(zoo.getAnimalSpecies().get(species));
        }
        System.out.println(zoo.getAnimalSpecies());

        UserInterface userInterface = new UserInterface(zoo);

    }
}
