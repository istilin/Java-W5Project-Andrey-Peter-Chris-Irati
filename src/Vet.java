import java.util.*;

public class Vet {
    private HashMap <Integer, Animal> animalsCare;
    private int numCalls;
    private Zoo zoo;
    public Vet(Zoo zoo){
        animalsCare = new HashMap<>();
        numCalls = 0;
        this.zoo = zoo;
    }
    public void callVet(Animal animal){
        zoo.getAnimals().remove(animal.getAnimalId());
        animalsCare.put(animal.getAnimalId(), animal);
    }

    public HashMap<Integer, Animal> getAnimalsCare() {
        return animalsCare;
    }
}
