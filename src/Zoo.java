import java.util.*;

public class Zoo {
    private String name = "Schönbrunn";
    private String address = "Maxingstraße 13b, 1130 Wien";
    private int numVisitors;
    private int totalEmployees;
    HashMap <Integer, Animal> animals;
    private HashMap <String, Integer> stock;
    private HashMap <String, Integer> costs;
    private double totalSalary;
    private Vet vet;

    public Zoo(){
        animals = new HashMap<>();
        costs = new HashMap<>();
        costs.put("FoodCost", 10);
        costs.put("MedsCost", 10);
        costs.put("EntranceFee", 30);
        costs.put("VetFee", 40);
        vet = new Vet(this);
        stock = new HashMap<>();
        stock.put("AmountFood", 2000);
        stock.put("AmountMeds", 2000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumVisitors() {
        return numVisitors;
    }

    public void setNumVisitors(int numVisitors) {
        this.numVisitors = numVisitors;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public HashMap<Integer, Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(HashMap<Integer, Animal> animals) {
        this.animals = animals;
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap <String, Integer> stock) {
        this.stock = stock;
    }

    public HashMap<String, Integer> getCosts() {
        return costs;
    }

    public void setCosts(HashMap<String, Integer> costs) {
        this.costs = costs;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Vet getVet() {
        return vet;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println(zoo.getName());
        Animal panther = new Animal("Pinky", "Panther", 5, 7, 9, 10000, zoo);
        System.out.println(panther.getAnimalPrice());
        System.out.println(zoo.getAnimals().get(100000000).getName());
        System.out.println(panther.getProfit());
        zoo.getVet().callVet(panther);
        System.out.println(panther.getProfit());
        System.out.println(zoo.getVet().getAnimalsCare().get(100000000).getName());

    }

}
