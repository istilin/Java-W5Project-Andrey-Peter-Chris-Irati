

import java.util.Scanner;

public class UserInterface {


    private static Scanner scan = new Scanner(System.in);


    public UserInterface() {
        System.out.println("WELCOME:\nPlease Login To The System:\n 1. Manager Login \n 2. Employee Login");
        int enteredCommand = scan.nextInt();
        switch (enteredCommand) {
            case 1:
                managerInterface();

            case 2:
                //employeeInterface();
        }
    }


    public void managerInterface() {
        try{
            CLS.main();
        }catch(Exception e){
            System.out.println(e);
        }
        boolean goOn = true;
        System.out.printf("\n WELCOME TO THE ZOO MANAGEMENT SYSTEM");
        String menu = "\n 1. Get Report\n 2. Employee Management \n 3. Animal Management \n 4. Make a new order";
        String reportMenu = " 1. Financial Report \n 2. Animal Report \n 3. Employee Report \n 4. Stock Report";
        String financialReport = " 1. Visitor Income \n 2. Food Expenses \n 3. Medicine Expenses \n 4. Salary Expenses \n 5. Vet Expenses \n 6. New Animal Expenses \n 7. Animal Sell Income \n 8. Total Profit/Loss";
        String animalReport = " 1. Number Per Species And In Total\n 2. Vet Call Per Species And In Total\n 3. Total Animals Sick Per Species And In Total";
        String stockReport = " 1. Medicine \n 2. Food";
        String employeeManagement = " 1. Add employee (login) \n 2. Fire employee\n 3. Check min employees\n 4. Assign Employees To Non Mandatory Tasks";
        String animalManagement = " 1. Add Animal(New Or Old) \n 2. Sell Animal";
        String makeOrder = " 1. Food \n 2. Medicine";


        while (goOn) {
            System.out.println(menu);
            int userInput = scan.nextInt();


            switch (userInput) {

                case 0:
                    goOn = false;
                    System.out.println("Thank you for using ZOO-Management-System");
                    break;

                case 1:
                    System.out.println(reportMenu);
                    int userInput2 = scan.nextInt();

                    switch (userInput2) {

                        case 1:
                            System.out.println(financialReport);
                            int userFinRepChoice = scan.nextInt();
                            switch (userFinRepChoice) {
                                case 1:
                                    System.out.println("Visitor Income: ");
                                    break;
                                case 2:
                                    System.out.println("Food Expenses: ");
                                    break;
                                case 3:
                                    System.out.println("Medicine Expenses: ");
                                    break;
                                case 4:
                                    System.out.println("Salary Expenses: ");
                                    break;
                                case 5:
                                    System.out.println("Vet Expenses: ");
                                    break;
                                case 6:
                                    System.out.println("New Animal Expenses: ");
                                    break;
                                case 7:
                                    System.out.println("Animal Sell Income: ");
                                    break;
                                case 8:
                                    System.out.println("Total Profits: ");
                                    break;
                                default:
                                    System.out.println("command not found");
                                    break;
                            }break;
                        case 2:
                            System.out.println(animalReport);
                            int animalReportInterface = scan.nextInt();
                            switch (animalReportInterface) {
                                case 1:
                                    System.out.println("Number Per Species And In Total");
                                    break;
                                case 2:
                                    System.out.println("Vet Call Per Species And In Total");
                                    break;
                                case 3:
                                    System.out.println("Animals Sick Per Species And In Total");
                                    break;
                                default:
                                    System.out.println("command not found");
                                    break;
                            }
                        case 3:
                            System.out.println("Employee Report: ");
                            break;
                        case 4:
                            System.out.println(stockReport);
                            int stockReportInterface = scan.nextInt();
                            switch (stockReportInterface) {
                                case 1:
                                    System.out.println("Food: ");
                                    break;
                                case 2:
                                    System.out.println("Medicine: ");
                                    break;
                                default:
                                    System.out.println("command not found");
                                    break;
                            }
                    }
                case 2:
                    System.out.println(employeeManagement);
                    int userInput3 = scan.nextInt();
                    switch (userInput3) {
                        case 1:
                            System.out.println(" Add Employee: ");
                            break;
                        case 2:
                            System.out.println(" Fire Employee: ");
                            break;
                        case 3:
                            System.out.println(" Check Min Employees: ");
                            break;
                        case 4:
                            System.out.println(" Assign Employees To Non Mandatory Tasks: ");

                    }
                    break;
                case 3:
                    System.out.println("Animal Management");
                    System.out.println(animalManagement);
                    int animalUserInput = scan.nextInt();
                    switch (animalUserInput) {
                        case 1:
                            System.out.println("Add Animal New or Old: ");
                            break;
                        case 2:
                            System.out.println("Sell Animal");
                            break;
                        default:
                            System.out.println("command not found");
                            break;
                    }
                    break;
                case 4:
                    System.out.println(makeOrder);
                    int orderUserInput = scan.nextInt();
                    switch (orderUserInput) {
                        case 1:
                            System.out.println("Food: ");
                            break;
                        case 2:
                            System.out.println("Medicine: ");
                            break;
                        default:
                            System.out.println("command not found");
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

}
/*    Financial Reports (visitor
                               income, food expenses,
                       medicine expenses, salary
                               expenses, vet expenses, new
                       animal expenses, old animal
              sell - total profit


 */