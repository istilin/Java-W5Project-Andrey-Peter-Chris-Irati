import java.util.*;

public class Zoo {
    private static Scanner scan = new Scanner(System.in);
    private String name = "Schönbrunn";
    private String address = "Maxingstraße 13b, 1130 Wien";
    private int numVisitors;
    private static HashMap <Integer, Animal> animals;
    private HashMap <String, Integer> stock;
    private HashMap <String, Integer> costs;
    private HashMap <Integer, Employee> employees;
    private double totalSalary;
    private Vet vet;
    private Manager manager;

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
        employees = new HashMap<>();
        manager = new Manager(this);

    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
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

    public HashMap<Integer, Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(int Id, Animal animal) {
        this.animals.put(Id, animal);
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


    public HashMap<Integer, Employee> getEmployees() {
        return employees;
    }

    public void addAnimal(){
        System.out.println("Please add the name of animal");
        scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Please add the species of the animal");
        scan = new Scanner(System.in);
        String species = scan.nextLine();
        for(int i : animals.keySet()){
            if(animals.get(i).getSpecies().equals(species)){
                System.out.println("Species already exists, we add new animal");
                new Animal(name, species, animals.get(i).getAmountFood(), animals.get(i).getAmountMeds(), animals.get(i).getAttractiveness(), animals.get(i).getAnimalPrice(), this);
                return;
            }
        }
        System.out.println("Please add the amount of food this animal consumes daily");
        scan = new Scanner(System.in);
        int amountOfFood = scan.nextInt();
        System.out.println("Please add the amount of meds this animal consumes daily");
        scan = new Scanner(System.in);
        int amountOfMeds = scan.nextInt();
        System.out.println("Please enter the attractiveness of the animal");
        scan = new Scanner(System.in);
        int attractiveness = scan.nextInt();
        System.out.println("Please enter the price of the animal");
        scan = new Scanner(System.in);
        double price = scan.nextDouble();

        new Animal(name, species, amountOfFood, amountOfMeds, attractiveness, price, this);

    }

    public void removeAnimal(){
        printAllAnimals();
        System.out.println("Please enter the ID of the animal you want to remove");
        scan = new Scanner(System.in);
        int animalID = scan.nextInt();
        if(animals.containsKey(animalID)) {
            animals.remove(animalID);
        } else {
            System.out.println("You entered an ID that doesn't exists, please try again");
            removeAnimal();
        }

    }

    public void printAllAnimals(){
        System.out.println("Total number of animals in the zoo: " + animals.size() + "\n");
        for(Animal animal : animals.values()){
            System.out.println(animal.toString());
        }
    }

    public void addEmployee(){
        System.out.println("Enter the name of the employee");
        scan = new Scanner(System.in);
        String name = scan.nextLine();

        this.getManager().hireEmployee(new Employee(name, this));
    }

    public void addEmployee(Employee employee) {

        this.getManager().hireEmployee(new Employee(employee.getName(), this));
    }

    public void removeEmployee(){
        printAllEmployees();
        System.out.println("Please enter the ID of the employee you want to fire");
        scan = new Scanner(System.in);
        int employeeID = scan.nextInt();
        if(employees.containsKey(employeeID)) {
            employees.remove(employeeID);
        } else {
            System.out.println("You entered an ID that doesn't exists, please try again");
            removeEmployee();
        }

    }


    public void printAllEmployees(){
        System.out.println("Printing all the employees");
        for (Employee employee : employees.values()){
            System.out.println(employee.toString());
        }
    }

}
