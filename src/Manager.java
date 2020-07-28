public class Manager {
    private String name = "Cheffy";
    private Zoo zoo;

    public Manager(Zoo zoo){
        this.zoo = zoo;
    }

    public void hireEmployee(Employee employee){
        zoo.getEmployees().put(employee.getEmployeeId(), employee);
    }

    public String getName() {
        return name;
    }
}
