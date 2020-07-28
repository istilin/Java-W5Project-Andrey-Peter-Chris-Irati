import java.util.*;

public class Employee {
    private String name;
    private int employeeId;
    private static int tempId = 2000000;
    private String email;
    private String password;

    public Employee(String name) {
        this.name = name;
        this.employeeId = tempId;
        this.email = Integer.toString(tempId) + "@gmail.com";
        this.password = name + Integer.toString(tempId);
        tempId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void feedAnimal(Animal animal){
        animal.feedAnimal();
    }

    public void medicateAnimal(Animal animal){
        animal.medicateAnimal();
    }
    public void entertainAnimal(Animal animal){
        animal.entertainAnimal();
    }

    public String checkAnimal(Animal animal) {
        Random rand = new Random();
        int n = rand.nextInt(100);
        if (n < 20) {
            animal.setSick(true);
        }
        return Integer.toString(n) + Boolean.toString(animal.isSick());
    }

}
