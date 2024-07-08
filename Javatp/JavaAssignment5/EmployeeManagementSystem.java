package JavaAssignment5;


import java.util.ArrayList;

class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}

public class EmployeeManagementSystem {

    private ArrayList<String> employeeList;

    public EmployeeManagementSystem() {
        employeeList = new ArrayList<>();
        employeeList.add("John Doe");
        employeeList.add("Jane Smith");
        employeeList.add("Michael Johnson");
    }

    public void checkEmployee(String name) throws EmployeeNotFoundException {
        if (!employeeList.contains(name)) {
            throw new EmployeeNotFoundException("Employee '" + name + "' not found.");
        } else {
            System.out.println("Employee '" + name + "' found.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        try {
            system.checkEmployee("Jane Smith");
            system.checkEmployee("Mark Brown");
        } catch (EmployeeNotFoundException e) {
            System.out.println("Caught EmployeeNotFoundException: " + e.getMessage());
        } finally {
            System.out.println("End of program.");
        }
    }
}