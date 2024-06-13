public class Main {
    public static void main(String[] args) {
        // Creating 10 Employee objects
        Employee emp1 = new Employee("E001", "John", "Doe", "IT", "New York", "Developer", "2020-01-15");
        Employee empCopy1= new Employee("E001", "Mark", "Grey", "IT", "Tampa", "Developer", "2020-07-10");
        Employee emp2 = new Employee("E002", "Jane", "Smith", "HR", "London", "Manager", "2019-03-12");
        Employee emp3 = new Employee("E003", "Alice", "Johnson", "Finance", "Sydney", "Analyst", "2018-07-22");
        Employee emp4 = new Employee("E004", "Bob", "Brown", "IT", "New York", "Developer", "2019-11-05");
        Employee emp5 = new Employee("E005", "Emily", "Clark", "Finance", "Sydney", "Manager", "2020-04-30");
        Employee emp6 = new Employee("E006", "Michael", "Wilson", "Marketing", "London", "Coordinator", "2017-09-18");
        Employee emp7 = new Employee("E007", "Samantha", "Harris", "HR", "New York", "Analyst", "2018-02-28");
        Employee emp8 = new Employee("E008", "David", "Martinez", "Marketing", "Sydney", "Manager", "2019-06-10");
        Employee emp9 = new Employee("E009", "Jennifer", "Lee", "IT", "London", "Engineer", "2021-03-25");
        Employee emp10 = new Employee("E010", "Daniel", "Taylor", "Finance", "New York", "Analyst", "2022-05-15");




       // Display all employees
        System.out.println("All Employees:");
        Employee.displayAllEmployees();

        // Find Employee by SOEID
        System.out.println("\nFinding Employee with SOEID E002:");
        Employee.findEmployeeBySOEID("E002");

        // Try to find a non-existing Employee by SOEID
        System.out.println("\nFinding Employee with SOEID E999:");
        Employee.findEmployeeBySOEID("E999");

        // Update an Employee's details
        System.out.println("\nUpdating Employee E003's details:");
        emp3.updateDetails("E003", "Alice", "Johnson", "Finance", "Sydney", "Senior Analyst", "2018-07-22");

        // Display updated employee details
        System.out.println("\nDisplaying updated details of E003:");
        emp3.displayEmployeeDetails();

        // Remove an Employee by SOEID
        System.out.println("\nRemoving Employee with SOEID E001:");
        Employee.removeEmployeeBySOEID("E001");

        // Display all employees after removal
        System.out.println("\nAll Employees after removal:");
        Employee.displayAllEmployees();

        // Try to remove a non-existing Employee by SOEID
        System.out.println("\nRemoving Employee with SOEID E999:");
        Employee.removeEmployeeBySOEID("E999");

        // List Employees by Department
        System.out.println("\nListing Employees in HR Department:");
        Employee.listEmployeesByDepartment("HR");

        // List Employees by Job Title
        System.out.println("\nListing Employees with Job Title 'Analyst':");
        Employee.listEmployeesByJobTitle("Analyst");

        // Sort Employees by Name
        System.out.println("\nSorting Employees by Name:");
        Employee.sortEmployeesByName();

        // Sort Employees By Date Hired
        System.out.println("\nEmployees by Date Hired:");
        Employee.sortEmployeesByDateHired();

        // List Employees By Job Location
        System.out.println("\nListing Employees by Job Location: 'New York':");
        Employee.listEmployeesByJobLocation("New York");
        
    }
}
