

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {


    private static Scanner scan = new Scanner(System.in);
    private Zoo zoo;

    public UserInterface(Zoo zoo, Vet vet) {
        System.out.println("WELCOME:\nPlease Login To The System:\n 1. Manager Login \n 2. Employee Login");
        int enteredCommand = scan.nextInt();
        this.zoo = zoo;
        switch (enteredCommand) {
            case 1:
                managerInterface();

            case 2:
                //employeeInterface();
        }
    }


    public void managerInterface() {
        clearConsole();
        boolean goOn = true;
        System.out.printf("\n WELCOME TO THE ZOO MANAGEMENT SYSTEM");
        String menu = "\n 1. Get Report\n 2. Employee Management \n 3. Animal Management \n 4. Make a new order \n 0. Log out";
        String reportMenu = " 0. GO BACK\n 1. Financial Report \n 2. Animal Report \n 3. Employee Report \n 4. Stock Report";
        String financialReport = " 0. GO BACK\n 1. Visitor Income \n 2. Food Expenses \n 3. Medicine Expenses \n 4. Salary Expenses \n 5. Vet Expenses \n 6. New Animal Expenses \n 7. Animal Sell Income \n 8. Total Profit/Loss";
        String animalReport = " 0. GO BACK\n 1. Number Per Species And In Total\n 2. Vet Call Per Species And In Total\n 3. Total Animals Sick Per Species And In Total";
        String stockReport = " 0. GO BACK\n 1. Medicine \n 2. Food";
        String employeeManagement = " 0. GO BACK\n 1. Add employee (login) \n 2. Fire employee\n 3. Check all employees\n 4. Assign Employees To Non Mandatory Tasks";
        String animalManagement = " 0. GO BACK\n 1. Add Animal(New Or Old) \n 2. Sell Animal";
        String makeOrder = " 0. GO BACK\n 1. Food \n 2. Medicine";
        boolean letItPass = false;
        int userInput = 0;
        String message = "default message";


        while (goOn) {

            clearConsole();
            System.out.println(message + "\n");
            message = "";
            System.out.println("MANAGER HOME\n" + menu);
            if(!letItPass){
            userInput = scan.nextInt();
            }





            switch (userInput) {

                case 0:
                    clearConsole();
                    goOn = false;
                    System.out.println("Thank you for using ZOO-Management-System");
                    break;

                case 1:
                    clearConsole();
                    System.out.println(reportMenu);
                    int userInput2 = scan.nextInt();

                    switch (userInput2) {

                        case 0:
                            break;

                        case 1:
                            clearConsole();
                            System.out.println(financialReport);
                            int userFinRepChoice = scan.nextInt();
                            switch (userFinRepChoice) {
                                case 0:
                                    break;

                                case 1:
//                                    boolean enterPressed = pressEnterToContinue();
//                                    if(enterPressed){
                                    message = "Visitor Income: ";

                                       break;
//                                    }
                                case 2:
                                    message = "Food Expenses: ";
                                    break;
                                case 3:
                                    message = "Medicine Expenses: ";
                                    break;
                                case 4:
                                    message = "Salary Expenses: ";
                                    break;
                                case 5:
                                    message = "Vet Expenses: ";
                                    break;
                                case 6:
                                    message = "New Animal Expenses: ";
                                    break;
                                case 7:
                                    message = "Animal Sell Income: ";
                                    break;
                                case 8:
                                    message = "Total Profits: ";
                                    break;
                                default:
                                    message = "command not found";
                                    break;
                            }
                            break;
                        case 2:
                            clearConsole();
                            System.out.println(animalReport);
                            int animalReportInterface = scan.nextInt();
                            switch (animalReportInterface) {
                                case 0:
                                    letItPass = true;
                                    break;
                                case 1:
                                    message = "Number Per Species And In Total";
                                    zoo.printAllAnimals();
                                    break;
                                case 2:
                                    message = "Vet Call Per Species And In Total";
                                    break;
                                case 3:
                                    message = "Animals Sick Per Species And In Total";
                                    break;
                                default:
                                    message = "command not found";
                                    break;
                            }
                            break;
                        case 3:
                            clearConsole();
                            message = "Employee Report: ";
                            break;
                        case 4:
                            clearConsole();
                            System.out.println(stockReport);
                            int stockReportInterface = scan.nextInt();
                            switch (stockReportInterface) {
                                case 1:
                                    message = "Medicine: ";
                                    break;
                                case 2:
                                    message = "Food: ";
                                    break;
                                default:
                                    message = "command not found";
                                    break;
                            }
                            break;
                        default:
                            clearConsole();
                            message = "Command not found Irati";
                            break;
                    }
                    break;
                case 2:
                    clearConsole();
                    System.out.println(employeeManagement);
                    int userInput3 = scan.nextInt();
                    switch (userInput3) {
                        case 0:
                            break;
                        case 1:
                            System.out.println(" Add Employee: ");
                            zoo.addEmployee();
                            break;
                        case 2:
                            System.out.println(" Fire Employee: ");
                            break;
                        case 3:
                            System.out.println(" Check All Employees: ");
                            zoo.printAllEmployees();
                            break;
                        case 4:
                            System.out.println(" Assign Employees To Non Mandatory Tasks: ");

                    }
                    break;
                case 3:
                    clearConsole();
                    System.out.println("Animal Management");
                    System.out.println(animalManagement);
                    int animalUserInput = scan.nextInt();
                    switch (animalUserInput) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("Add Animal: ");
                            zoo.addAnimal();

                            break;
                        case 2:
                            System.out.println("Sell Animal");
                            zoo.removeAnimal();
                            break;
                        default:
                            System.out.println("command not found");
                            break;
                    }
                    break;
                case 4:
                    clearConsole();
                    System.out.println(makeOrder);
                    int orderUserInput = scan.nextInt();
                    switch (orderUserInput) {
                        case 0:
                            break;
                        case 1:
                            message = "Food: ";
                            break;
                        case 2:
                            message = "Medicine: ";
                            break;
                        default:
                            message = "command not found";
                            break;

                    }
                    break;


            }


        }


    }

    public void employeeInterface() {
        String employee = " 1. Write Report\n 2. Check Animals In Vet\n 3. Check Not Finished Task";
        String writeReport = " 1. Is Animal Sick? \n";
        String isSick = " 1. Animal Is Sick \n 2. Animal Is Not Sick";
        String sendToVet = " 1. Send To Vet \n Don't Send To Vet";

    }

    public void clearConsole() {
        try {
            CLS.main();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
}

public boolean pressEnterToContinue(){
        String pressedEnter = scan.nextLine();
        if(pressedEnter.equals("")){
            return true;
        }
        return false;
}

}
/*    Financial Reports (visitor
                               income, food expenses,
                       medicine expenses, salary
                               expenses, vet expenses, new
                       animal expenses, old animal
              sell - total profit


 */