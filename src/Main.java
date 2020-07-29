import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println(zoo.getName());
        new Animal("Pinky", "Panther", 5, 7, 9, 10000, zoo);
        new Animal("Pandy", "Panda", 6, 3, 15, 5000, zoo);
        new Animal("Koaly", "Koala", 3, 2, 7, 7500, zoo);
        new Animal("King-Kong", "Gorilla", 7, 10, 5, 6000, zoo);
        new Animal("Pingu", "Penguin", 3, 7, 2, 1000, zoo);
        new Animal("Flippy", "Dolphin", 5, 4, 10, 12000, zoo);
        new Animal("Simba", "Lion", 8, 2, 8, 13000, zoo);
        new Animal("Blacky", "Panther", zoo);
        new Animal("Whitey", "Panther", zoo);
        new Animal("Bluey", "Panther", zoo);
        new Animal("Kung-Fu", "Panda", zoo);
        new Animal("Bamboo", "Panda", zoo);
        new Animal("Clammy", "Koala", zoo);
        new Animal("Pinguy", "Penguin", zoo);
        new Animal("Dolphino", "Dolphin", zoo);
        new Animal("Jumpy", "Dolphin", zoo);
        zoo.getManager().hireEmployee(new Employee("Peter", zoo));
        zoo.getManager().hireEmployee(new Employee("Irati", zoo));
        zoo.getManager().hireEmployee(new Employee("Chris", zoo));
        zoo.getManager().hireEmployee(new Employee("Andrey", zoo));
        /*for (Animal animal: zoo.getAnimals().values()){
            zoo.getEmployees().get(2000001).checkSickAnimal(animal);
            if (animal.isSick()){
                zoo.getEmployees().get(2000001).sendToVet(animal);
            }
        }*/
        for (Animal animal: zoo.getAnimals().values()){
            zoo.getEmployees().get(2000001).checkSickAnimal(animal);
        }
        for (Animal animal: zoo.getAnimals().values()){
            zoo.getEmployees().get(2000001).checkSickAnimal(animal);
        }
        for (Animal animal: zoo.getAnimals().values()){
            zoo.getEmployees().get(2000001).checkSickAnimal(animal);
        }
        if (zoo.getAnimals().get(100000000).isSick()){
            zoo.getEmployees().get(2000001).sendToVet(zoo.getAnimals().get(100000000));
        }
        if (zoo.getAnimals().get(100000003).isSick()){
            zoo.getEmployees().get(2000001).sendToVet(zoo.getAnimals().get(100000003));
        }
        if (zoo.getAnimals().get(100000006).isSick()){
            zoo.getEmployees().get(2000001).sendToVet(zoo.getAnimals().get(100000006));
        }
        if (zoo.getAnimals().get(100000009).isSick()){
            zoo.getEmployees().get(2000001).sendToVet(zoo.getAnimals().get(100000009));
        }
        if (zoo.getAnimals().get(100000012).isSick()){
            zoo.getEmployees().get(2000001).sendToVet(zoo.getAnimals().get(100000012));
        }



        zoo.printAllEmployees();


        UserInterface userInterface = new UserInterface(zoo);

    }
}
